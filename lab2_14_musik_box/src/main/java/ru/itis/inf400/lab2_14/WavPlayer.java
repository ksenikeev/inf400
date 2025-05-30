package ru.itis.inf400.lab2_14;

import javax.sound.sampled.*;
import java.io.File;

public class WavPlayer {
    public static void main(String[] args) {
        try {
            AudioInputStream audioStream =
                    AudioSystem.getAudioInputStream(new File("Черные глаза - Айдамир Мугу.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000); // Ждём окончания
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}