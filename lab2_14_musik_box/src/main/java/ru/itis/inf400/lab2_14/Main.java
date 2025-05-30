package ru.itis.inf400.lab2_14;

public class Main {
    public static void main(String[] args) {
        PlayList playList = new PlayList();
        playList.load();
        playList.showPlaylist();
        playList.add(new Song("Черные глаза", "Айдамир Мугу",
                ""));
        playList.add(new Song("Прыгну со скалы",
                "Король и Шут", ""));
        playList.save();
    }
}
