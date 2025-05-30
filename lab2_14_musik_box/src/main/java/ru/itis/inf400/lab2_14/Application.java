package ru.itis.inf400.lab2_14;

import java.util.Scanner;

public class Application {
    private final Status status = Status.NOTPLAYED;
    private final String[] commandsPlayed = {"1. stop", "2. next", "3. prev", "4. showAll", "5. exit"};
    private final String[] commandsNOTPlayed = {"1. showAll", "2. findByName", "3. findByAuthor", "4. play", "5. exit"};
    private PlayList playList;

    public void start() {
        Scanner scan = new Scanner(System.in);

        playList = new PlayList();
        playList.load();

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
            case "5": return false;
            case "4": {
                if (status == Status.PLAYED) {
                    playList.showPlaylist();
                } else {

                }
            }
        }

        return true;
    }



}
