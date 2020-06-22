package com.zhongyuxiang.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @auth zhongyuxiang
 * @date 2020/6/22
 * @Description
 */
public class BaseServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uri = request.getRequestURI();
        String[] uriArr = uri.split("/");
        String method = uriArr[uriArr.length - 1];
        Class clazz = this.getClass();
        try {
            // （方法名成，参数1，参数2）
            Method m = clazz.getDeclaredMethod(method, HttpServletRequest.class, HttpServletResponse.class);
            //暴力反射
            m.setAccessible(true);
            //执行方法
            m.invoke(this, request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
