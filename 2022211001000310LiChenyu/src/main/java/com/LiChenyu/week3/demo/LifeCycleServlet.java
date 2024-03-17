package com.LiChenyu.week3.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LifeCycleServlet extends HttpServlet {
    public LifeCycleServlet(){
        System.out.println("I am in constructor --> LifeCycleServlet()");
    }
    public void init(){
        System.out.println("I am in init()");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        System.out.println("I am in service() --> doGet()");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    public void destroy(){
        System.out.println("I am in destroy");
    }
}
