package ru.itis.inf400.lab2_09.clientserver;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProtocol {

    public static void main(String[] args) {
        String message = "Привет, мир!";
        int size = message.getBytes().length;

        try {
            // Настраиваем подключение к серверу
            Socket clientSocket = new Socket("127.0.0.1",50000);

            System.out.println("From client: connected");

            OutputStream outputStream = clientSocket.getOutputStream();
//            // Отправляем на сервер информацию
            DataOutputStream dos = new DataOutputStream(outputStream);

            while (true) {
                Scanner scanner = new Scanner(System.in);
                // Берем со сканера текст
                // Вычисляем размер в байтах
                // Отправляем размер
                // Отправляем текст как массив байт

                dos.writeInt(size);
                dos.write(message.getBytes());

                InputStream inputStream = clientSocket.getInputStream();
                // читаем ответ сервера
                // сначала размер сообщения
                // готовим буфер нужного размера
                // считываем в буфер все сообщение
                // выводим на консоль
                if (message.equals("end")) break;
            }
            clientSocket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
