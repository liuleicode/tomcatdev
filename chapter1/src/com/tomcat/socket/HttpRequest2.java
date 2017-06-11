package com.tomcat.socket;

import java.io.*;
import java.net.Socket;

/**
 * Created by liulei on 2017/6/4.
 */
public class HttpRequest2 {

    public static void  main(String []args) throws IOException, InterruptedException {
        Socket socket = new Socket("127.0.0.1",80);

        OutputStream outputStream = socket.getOutputStream();
        boolean autoflash = true;

        PrintWriter out  = new PrintWriter(outputStream,autoflash);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out.println("GET / HTTP1.1");
        out.println("Host: localhost:8080");
        out.println("Connection: Close");
        out.println();

        boolean loop = true;
        StringBuffer sb  = new StringBuffer(8096);

        while(loop){

            if(in.ready()){
                int i = 0;
                while (i!=-1) {
                    sb.append((char) in.read());

                }
                loop =false;
            }
            Thread.currentThread().sleep(50);

            socket.close();
        }

    }
}
