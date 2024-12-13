package ru.itis.nf400.lab10;

public class MessageService {

    private Message[] messages;

    public Message send(User userFrom, User userTo, String message) {
        Message result = new Message(userFrom, userTo, message, "2024-12-07 10:24");

        return result;
    }

    public Message[] create4Messages(User[] users) {
        messages = new Message[4];
        messages[0] = send(users[0], users[1], "Hello 0!");
        messages[1] = send(users[1], users[2], "Hello 1!");
        messages[2] = send(users[2], users[3], "Hello 2!");
        messages[3] = send(users[3], users[0], "Hello 3!");
        return messages;
    }
}
