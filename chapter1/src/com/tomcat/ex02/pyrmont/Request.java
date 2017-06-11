package com.tomcat.ex02.pyrmont;

import java.io.InputStream;

/**
 * Created by liulei on 2017/6/11.
 */
public class Request {
    InputStream input;
    private String uri;

    public Request(InputStream input) {

        this.input = input;
    }

    public void parse() {
    }

    public String getUri() {
        return uri;
    }
}
