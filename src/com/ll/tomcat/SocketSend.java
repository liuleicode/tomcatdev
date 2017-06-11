package com.ll.tomcat;

import java.io.*;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liulei on 2017/5/19.
 */
public class SocketSend {
    public static void main(String[] args) throws IOException, InterruptedException {

        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String systime = formatter.format(currentTime);
        System.out.println(systime);

        Socket socket = new Socket("127.0.0.1", 8080);
        OutputStream os = socket.getOutputStream();
        boolean autoflash = true;
        PrintWriter out = new PrintWriter(socket.getOutputStream(), autoflash);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out.println("GET /index.jsp HTTP/1.1");
        out.println("Host: localhost:8080");
        out.println("Connect close");
        out.println();

        boolean loop = true;

        StringBuffer sb = new StringBuffer(8096);

        while(loop){
            if(in.ready()){
               int i = 0;
               while (i!=-1){
                   i = in.read();
                   sb.append((char)i);

               }
               loop = false;
            }
            Thread.currentThread().sleep(50);
        }
        System.out.println(sb.toString());
        socket.close();
    }
}
