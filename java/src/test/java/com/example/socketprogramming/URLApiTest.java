package com.example.socketprogramming;

import java.io.IOException;

public class URLApiTest {
    public static void main(String[] args) {
        URLApi urlApi = new URLApi();
        try {
            urlApi.readFile("file:/Users/aditya/Downloads/f26b816a9cd611eb.txt.clean.txt");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
