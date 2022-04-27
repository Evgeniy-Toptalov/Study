package FirstQuarter.Java2.Lesson6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static final String SERVER_HOST = "127.0.0.1";
    public static final int SERVER_PORT = 8221;

    public static void main(String[] args) {
        try (Socket clientSocket = new Socket(SERVER_HOST, SERVER_PORT)) {
            System.out.println("Соединение установленно");
            System.out.println("Введите сообщение для сервера");

            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

            Thread threadSend = new Thread(new Runnable() {
                @Override
                public void run() {
                    sendMessageToServer(out, clientSocket);
                }
            });

            Thread threadGet = new Thread(new Runnable() {
                @Override
                public void run() {
                    getMessageFromServer(in, clientSocket);
                }
            });

            threadSend.start();
            threadGet.start();
            threadSend.join();
            threadGet.join();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void sendMessageToServer(DataOutputStream out, Socket clientSocket) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String clientMessage = scanner.nextLine();
            try {
                out.writeUTF(clientMessage);
                if (clientMessage.equals("/end")) {
                    clientSocket.close();
                    break;
                }
            } catch (IOException e) {
                System.out.println("Сетевое соединение было закрыто");
            }

        }
    }

    private static void getMessageFromServer(DataInputStream in, Socket clientSocket) {
        while (true) {
            try {
                String serverMessage = in.readUTF();
                System.out.println("Server write: " + serverMessage);
                if (serverMessage.startsWith("/end")) {
                    clientSocket.close();
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
