package ru.itis.inf400.lab2_09.readerwriter;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ReaderWriterClient {
    public static void main(String[] args) {

        try {
            // Настраиваем подключение к серверу
            Socket clientSocket = new Socket("127.0.0.1",50000);

            System.out.println("From client: connected");

            InputStream inputStream = clientSocket.getInputStream();
            InputStreamReader isr = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(isr);

            OutputStream outputStream = clientSocket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(outputStream);
            BufferedWriter bw = new BufferedWriter(osw);
//            // Отправляем на сервер информацию

            while (true) {
                Scanner scanner = new Scanner(System.in);
                String outputMessage = scanner.nextLine();
                bw.write(outputMessage + "\n");
                bw.flush();
                if (outputMessage.equals("stop")) break;

                String inputMessage = br.readLine();
                System.out.println(inputMessage);
                if (inputMessage.equals("stop")) break;

            }
            clientSocket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
