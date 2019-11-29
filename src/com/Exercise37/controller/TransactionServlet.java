package com.Exercise37.controller;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TransactionServlet")
public class TransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Properties props =new Properties();
		InputStream in= this.getClass().getClassLoader().getResourceAsStream("resources.propieties");
		
		props.load(in);
		//1-Declarar variables
		
		String urlServer=props.getProperty("urlServer");
		String user=props.getProperty("username");
		String pass=props.getProperty("password");
		String sql1="INSERT INTO Empleados(nombreEmpleado,edadEmpleado,domicilioEmpleado,salarioEmpleado,departamentoEmpleado) VALUES('pa',10,'pa',10.0,'pa')";
		String sql2="INSERT INTO Empleados(nombreEmpleado,edadEmpleado,domicilioEmpleado,salarioEmpleado,departamentoEmpleado) VALUES('pe',11,'pe',11.0,'pe')";
		String sql3="INSERT INTO Empleados(nombreEmpleado,edadEmpleado,domicilioEmpleado,salarioEmpleado,departamentoEmpleado) VALUES('pu',13,'pe',13.0,'po')";
		String sql4="INSERT INTO Empleados(nombreEmpleado,edadEmpleado,domicilioEmpleado,salarioEmpleado,departamentoEmpleado) VALUES('pi',14,'po',14.0,'pi')";
		String sql5="INSERT INTO Empleados(nombreEmpleado,edadEmpleado,domicilioEmpleado,salarioEmpleado,departamentoEmpleado) VALUES('po',17,'pi',15.0,'pu')";
		
		System.out.println("Url Server"+urlServer);
		System.out.println("user"+user);
		System.out.println("pass"+pass);
		
		//2-Declarar Objetos
		
		Connection conn=null;
		PreparedStatement pstmnt=null;
		int rowsAffected=0;
		
		
		try {
			//3-Conectar DB
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			conn=DriverManager.getConnection(urlServer,user,pass);
			conn.setAutoCommit(false);
			
			pstmnt = conn.prepareStatement(sql1);
			pstmnt.executeUpdate();
			pstmnt = conn.prepareStatement(sql2);
			pstmnt.executeUpdate();
			pstmnt = conn.prepareStatement(sql3);
			pstmnt.executeUpdate();
			pstmnt = conn.prepareStatement(sql4);
			pstmnt.executeUpdate();
			pstmnt = conn.prepareStatement(sql5);
			pstmnt.executeUpdate();
			
			conn.commit();
			//conn.rollback();
			
			response.getWriter().append("Transaccion Hecha!");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally
		{
			try
			{
				pstmnt.close();
				conn.close();
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
		//4-Config prepared statement
		
	}

}
