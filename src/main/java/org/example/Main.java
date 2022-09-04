package org.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            int counter = 1;
            while (true) {
                Socket socket = serverSocket.accept();
                MyWebServer webServer = new MyWebServer(socket);
                Thread thread = new Thread(webServer, "[" + counter + "]");
                thread.start();
                counter += 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}