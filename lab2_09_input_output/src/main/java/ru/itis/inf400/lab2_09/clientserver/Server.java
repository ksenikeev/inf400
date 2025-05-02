package ru.itis.inf400.lab2_09.clientserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static final int SERVER_PORT = 50000;

    public static void main (String[] args){
        try {
            ServerSocket server = new ServerSocket(SERVER_PORT);
            System.out.println("start server");
            // wait client connection
            // Объект соединения с клиентом
            Socket clientSocket = server.accept();
            // Берем InputStream, ассоциированный с клиентом
            InputStream inputStream = clientSocket.getInputStream();

            int r = inputStream.read();
            System.out.println("запрос клиента " + r);

            OutputStream outputStream = clientSocket.getOutputStream();
            outputStream.write(5);

            clientSocket.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
