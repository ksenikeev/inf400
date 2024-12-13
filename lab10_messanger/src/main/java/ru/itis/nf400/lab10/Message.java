package ru.itis.nf400.lab10;

public class Message {

    private User userFrom;
    private User userTo;
    private String message;
    private String dateTime;

    public Message(User userFrom, User userTo, String message, String dateTime) {
        this.userFrom = userFrom;
        this.userTo = userTo;
        this.message = message;
        this.dateTime = dateTime;
    }
}
