package com.hongye;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 13-10-10 上午11:57
 */
public class HelloFilter implements Filter {

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        System.out.println("Filter start");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)req;
        System.out.println("access URI="+request.getRequestURI());
        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {
        System.out.println("Filter over");
    }

}
