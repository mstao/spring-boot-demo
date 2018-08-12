package me.mingshan.example.security.filter;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @Author: mingshan
 * @Date: Created in 19:38 2018/8/12
 */
public class AfterCsrfFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.print(" 11111111111111 ");

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
