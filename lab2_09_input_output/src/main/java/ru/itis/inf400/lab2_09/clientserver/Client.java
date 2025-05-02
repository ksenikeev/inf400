package ru.itis.inf400.lab2_09.clientserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class Client {

    public static void main(String[] args) {

        try {
            // Настраиваем подключение к серверу
            Socket clientSocket = new Socket("127.0.0.1",50000);

            System.out.println("From client: connected");

            OutputStream outputStream = clientSocket.getOutputStream();
            // Отправляем на сервер информацию
            outputStream.write(2);

            InputStream inputStream = clientSocket.getInputStream();
            // читаем ответ сервера
            int r = inputStream.read();
            System.out.println("ответ сервера " + r);
            clientSocket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
