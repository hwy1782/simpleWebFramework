package com.hongye;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 13-10-10 上午11:57
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.getWriter().println("Hello World ");
        res.getWriter().println("Hello World ");
        res.getWriter().println("Hello World sb ");

        Cookie cookie_nick = new Cookie("nick", "hint");

        res.addCookie(cookie_nick);
    }

}
