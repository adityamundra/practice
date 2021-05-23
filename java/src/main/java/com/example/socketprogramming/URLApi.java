package com.example.socketprogramming;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLApi {
    
    public void readFile(final String path) throws IOException{
        URL url = new URL(path);
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        int data = inputStream.read();
        while(data!=-1){
            System.out.println((char) data);
            data = inputStream.read();
        }
    }

}
