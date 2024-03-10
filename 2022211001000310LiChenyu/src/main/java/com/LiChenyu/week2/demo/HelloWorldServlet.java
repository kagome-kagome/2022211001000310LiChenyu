package com.LiChenyu.week2.demo;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException{
        PrintWriter writer=response.getWriter();
        writer.println("Name:Li Chenyu");
        writer.println("ID:2022211001000310");
        writer.println("Date and Time Sun Mar 10 20:02:57 CST 2024");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
