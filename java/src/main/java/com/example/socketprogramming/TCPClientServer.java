package com.example.socketprogramming;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPClientServer {
    
}

class Client {

    Client(String address, int port){
        BufferedReader input = null;
        DataOutputStream output = null;
        Socket socket = null;
        try {
            socket = new Socket(address,port);
            System.out.println("Connected!");
            input = new BufferedReader(new InputStreamReader(System.in));
            output = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String line = "";
        while(!line.equals("abort")){
            try {
                line = input.readLine();
                output.writeUTF(line);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        try{
            if(input !=null) input.close();
            if(output!=null) output.close();
            if(socket!=null) socket.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
}

class Server {

    public Server(int port){
        ServerSocket server = null;
        Socket socket = null;
        BufferedReader input = null;
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");
            socket = server.accept();
            System.out.println("Client accepted!");
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = "";
            while(!line.equals("abort")){
                try{
                    line = input.readLine();
                    System.out.println(line);
                }catch(IOException ex){
                    ex.printStackTrace();
                }
            }
            System.out.println("Closing connection");
            socket.close();
            server.close();
            input.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}


