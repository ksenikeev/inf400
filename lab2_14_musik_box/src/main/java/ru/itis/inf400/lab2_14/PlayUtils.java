package ru.itis.inf400.lab2_14;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Optional;
import java.util.Scanner;

public class PlayUtils {

    private IApplication application;

    private Clip clip;

    public PlayUtils(IApplication application) {
        this.application = application;
    }

    public void stop() {
        if(clip != null && clip.isRunning()) {
            clip.stop();
        }
    }

    public void playSong(Integer trackNumber) {
        if (trackNumber == null) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите номер трека:");
            trackNumber = scan.nextInt();
        }
        Optional<Song> song = application.getPlayList().findByNumber(trackNumber);
        if(song.isPresent()) {
            application.setCurrentSong(song.get());
            new Thread(() ->{
                try {
                    AudioInputStream audioStream =
                            AudioSystem.getAudioInputStream(
                                    new File(application.getCurrentSong().getPath()));
                    clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    clip.addLineListener(event -> {
                        //System.out.println("----------------- " + event.getType().toString() + "---------------");
                        if (event.getType().toString().equals("Stop"))
                            application.setStatus(Status.NOTPLAYED);
                    });
                    clip.start();
                    //clip.stop();
                    //Thread.sleep(clip.getMicrosecondLength() / 1000); // Ждём окончания
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
            application.setStatus(Status.PLAYED);
            System.out.println("Проигрывается: " + application.getCurrentSong().getName());
        }
    }

}
