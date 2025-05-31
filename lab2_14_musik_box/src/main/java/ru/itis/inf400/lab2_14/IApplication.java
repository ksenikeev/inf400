package ru.itis.inf400.lab2_14;

public interface IApplication {
    void setCurrentSong(Song song);
    void setStatus(Status status);
    PlayList getPlayList();
    Song getCurrentSong();
}
