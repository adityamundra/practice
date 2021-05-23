package com.example.socketprogramming;

public class TCPSocketProgrammingTest {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Client client = new Client("127.0.0.1", 9000);
            } 
        });

        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Server server = new Server(9000);
            }
        });

        thread2.start();
        Thread.sleep(3000);
        thread1.start();
    }
    
}
