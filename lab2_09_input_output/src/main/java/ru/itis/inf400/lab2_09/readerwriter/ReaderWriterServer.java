package ru.itis.inf400.lab2_09.readerwriter;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ReaderWriterServer {
    public static final int SERVER_PORT = 50000;

    public static void main (String[] args){
        try {
            ServerSocket server = new ServerSocket(SERVER_PORT);
            System.out.println("start server");
            // ожидаем подключения клиента
            // Объект соединения с клиентом
            Socket clientSocket = server.accept();
            System.out.println("Клиент подключился");
            // Берем InputStream, ассоциированный с клиентом
            InputStream inputStream = clientSocket.getInputStream();
            InputStreamReader isr = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(isr);

            OutputStream outputStream = clientSocket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(outputStream);
            BufferedWriter bw = new BufferedWriter(osw);
            while (true)
            {
                String inputMessage = br.readLine();
                System.out.println(inputMessage);

                if (inputMessage.equals("stop")) break;
                Scanner scanner = new Scanner(System.in);
                // Берем со сканера текст
                // Вычисляем размер в байтах
                // Отправляем размер
                // Отправляем текст как массив байт
                String outputMessage = scanner.nextLine();
                bw.write(outputMessage + "\n");
                bw.flush();
                if (outputMessage.equals("stop")) break;
            }

            clientSocket.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
