package ru.itis.inf400.lab2_09.clientserver;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProtokol {
    public static final int SERVER_PORT = 50000;

    public static void main (String[] args){
        try {
            ServerSocket server = new ServerSocket(SERVER_PORT);
            System.out.println("start server");
            // ожидаем подключения клиента
            // Объект соединения с клиентом
            Socket clientSocket = server.accept();
            // Берем InputStream, ассоциированный с клиентом
            InputStream inputStream = clientSocket.getInputStream();
            DataInputStream dis = new DataInputStream(inputStream);
            //while (true)
            {
                //читаем размер сообщения
                int size = dis.readInt();
                System.out.println("запрос клиента " + size);
                byte[] buffer = new byte[size];
                dis.read(buffer);
                System.out.println(new String(buffer));

                Scanner scanner = new Scanner(System.in);
                // Берем со сканера текст
                // Вычисляем размер в байтах
                // Отправляем размер
                // Отправляем текст как массив байт
                OutputStream outputStream = clientSocket.getOutputStream();
                outputStream.write(5);
            }

            clientSocket.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
