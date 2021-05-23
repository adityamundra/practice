package com.example.socketprogramming;

public class UDPSocketProgrammingTest {

    public static void main(String[] args) {
        Thread clientThread = new Thread(new Runnable(){
            @Override
            public void run() {
                UDPClient udpClient = new UDPClient();
            }
        });
    
        Thread serverThread = new Thread(new Runnable(){
            @Override
            public void run() {
                UDPServer udpServer = new UDPServer();
            }
        });
        serverThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        clientThread.start();
    }
    
}
