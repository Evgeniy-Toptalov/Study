package FirstQuarter.Java2.Lesson6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private static final int PORT = 8221;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Сервер начал работу, ожидаем новые подключения");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Клиент подключился");

            DataInputStream in = new DataInputStream(clientSocket.getInputStream()); // чтение
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream()); // запись

            Thread threadSend = new Thread(new Runnable() {
                @Override
                public void run() {
                    sendMessageToClient(out, serverSocket);
                }
            });

            Thread threadGet = new Thread(new Runnable() {
                @Override
                public void run() {
                    getMessageFromClient(in, serverSocket);
                }
            });

            threadSend.start();
            threadGet.start();
            threadSend.join();
            threadGet.join();

        } catch (IOException e) {
            System.err.println("Ошибка при подключении к порту " + PORT);
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void sendMessageToClient(DataOutputStream out, ServerSocket serverSocket) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String clientMessage = scanner.nextLine();
            try {
                out.writeUTF(clientMessage);
                if (clientMessage.equals("/end")) {
                    serverSocket.close();
                    break;
                }
            } catch (IOException e) {
                System.out.println("Сетевое соединение было закрыто");
            }
        }
    }

    private static void getMessageFromClient(DataInputStream in, ServerSocket serverSocket) {
        while (true) {
            try {
                String clientMessage = in.readUTF();
                System.out.println("Client write: " + clientMessage);
                if (clientMessage.equals("/end")) {
                    serverSocket.close();
                    System.out.println("Соединение закрыто");
                    break;
                }
            } catch (IOException e) {
                System.out.println("Сетевое соединение было закрыто");
                break;
            }
        }
    }

}
