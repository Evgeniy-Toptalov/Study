package com.example.server;

import com.example.server.chat.MyServer;

public class ServerApp {

    private static final int PORT = 8193;

    public static void main(String[] args) {
        new MyServer().start(PORT);
    }
}
