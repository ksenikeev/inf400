package ru.itis.inf400.lab2_14;

import java.util.Scanner;

public class Application implements IApplication {
    private Status status = Status.NOTPLAYED;

    private final String[] commandsPlayed = {"1. stop", "2. next", "3. prev", "4. showAll", "5. exit", "6. add"};

    private final String[] commandsNOTPlayed = {"1. showAll", "2. findByName", "3. findByAuthor", "4. play", "5. exit", "6. add"};

    private PlayList playList;

    private Scanner scan = new Scanner(System.in);

    private Song currentSong;

    private PlayUtils playUtils;

    public PlayList getPlayList() {
        return playList;
    }

    public Song getCurrentSong() {
        return currentSong;
    }

    public void setCurrentSong(Song currentSong) {
        this.currentSong = currentSong;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void start() {

        playList = new PlayList();
        playList.load();

        playUtils = new PlayUtils(this);

        boolean exitFlag = true;

        while (exitFlag) {
            if (status == Status.NOTPLAYED) {
                menuNOTPlayed();
            } else {
                menuPlayed();
            }

            System.out.print("Введите команду: ");
            String command = scan.nextLine();
            exitFlag = commandHandler(command);
        }
    }

    public void menuPlayed() {
        for (String str : commandsPlayed)
            System.out.println(str);
    }

    public void menuNOTPlayed() {
        for (String str : commandsNOTPlayed)
            System.out.println(str);
    }

    public boolean commandHandler(String command) {
        switch (command) {
            case "6":
                addSong();
                playList.save();
                break;
            case "5": return false;
            case "4":
                if (status == Status.PLAYED) {
                    playList.showPlaylist();
                } else {
                    playUtils.playSong(null);
                }
                break;
            case "3":
                if (status == Status.NOTPLAYED) {
                    findByAuthor();
                } else {
                    playUtils.stop();
                    playUtils.playSong(findPrevSong());
                }
                break;
            case "2":
                if (status == Status.NOTPLAYED) {
                    findByName();
                } else {
                    playUtils.stop();
                    playUtils.playSong(findNextSong());
                }
                break;
            case "1":
                if (status == Status.NOTPLAYED) {
                    playList.showPlaylist();
                } else {
                    playUtils.stop();
                    status = Status.NOTPLAYED;
                }
                break;
        }

        return true;
    }


    public void addSong() {
        Song song = new Song();
        System.out.println("Введите название песни");
        song.setName(scan.nextLine());
        System.out.println("Введите автора");
        song.setAuthor(scan.nextLine());
        System.out.println("Введите путь к файлу");
        song.setPath(scan.nextLine());
        playList.add(song);
    }

    public void findByName() {
        System.out.println("Введите название трека");
        playList.findByName(scan.nextLine());
    }

    public void findByAuthor() {
        System.out.println("Введите автора");
        playList.findByAuthor(scan.nextLine());
    }

    public Integer findNextSong() {
        if (currentSong == null) return null;
        if (currentSong.getNumber() == playList.size()) return 1;
        return currentSong.getNumber() + 1;
    }

    public Integer findPrevSong() {
        if (currentSong == null) return null;
        if (currentSong.getNumber() == 1) return playList.size();
        return currentSong.getNumber() - 1;
    }
}
