package com.tomcat.ex02.pyrmont;

import java.io.OutputStream;

/**
 * Created by liulei on 2017/6/11.
 */
public class Response {
    Request request;

    public Response(OutputStream output) {
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
