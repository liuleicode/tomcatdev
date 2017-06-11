package com.tomcat.ex02.pyrmont;

import com.tomcat.socket.HttpServer;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by liulei on 2017/6/11.
 */
public class PrimitiveServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("from service");
//        PrintWriter out = response.getWriter();
//        out.println("Hello.Roses are red");
//        out.println("Violets are blue");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
