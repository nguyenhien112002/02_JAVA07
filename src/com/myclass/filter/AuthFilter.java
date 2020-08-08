package com.myclass.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = { "/*" })
public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        // ÉP KIỂU ServletRequest THÀNH HttpServletRequest
        // ÉP KIỂU ServletResponse THÀNH HttpServletResponse
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        String action = req.getServletPath();

        // BỎ QUA MẤY LINK NÀY KO CẦN KIỂM TRA ĐĂNG NHẬP
        if (action.startsWith("/login") || action.startsWith("/logout")) {
            chain.doFilter(request, response);
            return;
        }

        // KIỂM TRA SESSION
        HttpSession session = req.getSession();
        if (session.getAttribute("LOGIN") == null) {
            resp.sendRedirect(req.getContextPath() + "/login");
            return;
        }

        // phan quyen nguoi dung
        // phan quyen dua tren url va rolename

        chain.doFilter(request, response);

    }

}
