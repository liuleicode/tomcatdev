package com.tomcat.socket;

import java.io.*;
import java.net.Socket;

/**
 * Created by liulei on 2017/6/4.
 */
public class HttpRequest {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("123.125.114.144", 80);
        OutputStream outputStream = socket.getOutputStream();
        boolean autoflash = true;

        PrintWriter out = new PrintWriter(outputStream, autoflash);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        out.println("GET / HTTP/1.1");
        out.println("Host: localhost:80");
        out.println("Connection: Close");

        out.println();

        boolean loop = true;
        StringBuffer sb = new StringBuffer(8096);
        while (loop) {
            System.out.println(in.ready());
            if (in.ready()) {
                int i = 0;

                while (i != -1) {
                    i = in.read();
                    sb.append((char) i);
                }
                loop = false;
            }
            System.out.println("循环");
            Thread.currentThread().sleep(50);
        }
        System.out.println(sb.toString());

    }
}
