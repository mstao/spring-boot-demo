package com.example.springbootdemo.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Description:
 * @Author: Minsghan
 * @Date: Created in 11:10 2017/11/12
 */
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) srequest;
        System.out.println("this is MyFilter,url :" + request.getRequestURI());
        chain.doFilter(srequest, sresponse);
    }

    @Override
    public void destroy() {

    }
}
