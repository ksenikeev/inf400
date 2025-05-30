package ru.itis.inf400.lab2_14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private static final String FILE_NAME = "playlist";
    private List<Song> songs;
    public void load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){
            songs = (List<Song>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Файл отсутствует");
            songs = new ArrayList<>();
        } catch (IOException e) {
            System.out.println("Файл с данными испорчен");
            songs = new ArrayList<>();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException();
        }
    }

    public void save() {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(FILE_NAME))) {
            oos.writeObject(songs);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(Song song) {
        songs.add(song);
    }

    public void showPlaylist() {
        for (int i = 0; i < songs.size(); i++) {
            System.out.println(i + 1 + " " + songs.get(i).getAuthor() + " "
            + songs.get(i).getName());
        }
    }
}
