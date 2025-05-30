package ru.itis.inf400.lab2_14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        song.setNumber(songs.size() + 1);
        songs.add(song);

    }

    public void showPlaylist() {
        for (int i = 0; i < songs.size(); i++) {
            System.out.println(songs.get(i).getNumber() + " " + songs.get(i).getAuthor() + " "
            + songs.get(i).getName());
        }
    }

    public void findByAuthor(String author){
        songs.stream().filter(p -> p.getAuthor().toUpperCase().contains(author.toUpperCase()))
                .forEach(p -> System.out.println(p.getNumber() + " " + p.getAuthor() + " "
                        + p.getName()));

    }

    public void findByName(String name){
        songs.stream().filter(p -> p.getName().toUpperCase().contains(name.toUpperCase()))
                .forEach(p -> System.out.println(p.getNumber() + " " + p.getAuthor() + " "
                        + p.getName()));

    }

    public Optional<Song> findByNumber(int number) {
        return songs.stream().filter(p -> p.getNumber() == number)
                .findFirst();
    }

    public int size() {
        return songs.size();
    }
}
