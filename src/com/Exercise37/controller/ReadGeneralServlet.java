package com.Exercise37.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ReadGeneralServlet")
public class ReadGeneralServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8'");
		PrintWriter output =response.getWriter();
		
		//1- Declarar Variables
		Properties props =new Properties();
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("resources.propieties");
		props.load(in);
		
		String urlServer =props.getProperty("urlServer");
		String user= props.getProperty("username");
		String pass=props.getProperty("password");
		
		output.append("url:"+urlServer);
		output.append("user: "+user);
		output.append("pass: "+pass);
		
		output.close();
	}

}
