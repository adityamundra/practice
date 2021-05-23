package com.example.socketprogramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClientServer {
    
}

class UDPClient {
    public UDPClient(){
        try {
            byte[] content = "012345678".getBytes();
            InetAddress address = InetAddress.getLocalHost();
            DatagramPacket packet = new DatagramPacket(content, content.length, address, 80);
            DatagramSocket datagramSocket = new DatagramSocket();
            datagramSocket.send(packet);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class UDPServer {
    UDPServer(){
        try {
            DatagramSocket datagramSocket = new DatagramSocket(80);
            byte[] byteBuffer = new byte[10];
            DatagramPacket newDatagramPacket = new DatagramPacket(byteBuffer, byteBuffer.length);
            datagramSocket.receive(newDatagramPacket);
            String recievedContent = new String(newDatagramPacket.getData());
            System.out.println(recievedContent);
        } catch (SocketException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}