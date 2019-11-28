package com.Exercise37.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Exercise37.model.Employee;

@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8'");
		PrintWriter output= response.getWriter();
		
		Employee myEmployee = new Employee();
		
		//myEmployee.setIdEmployee(Integer.parseInt(request.getParameter("txtIdEmployee"))); 
		myEmployee.setNameEmployee(request.getParameter("txtNameEmployee"));
		myEmployee.setAgeEmployee(Integer.parseInt(request.getParameter("txtAgeEmployee")));
		myEmployee.setAddressEmployee(request.getParameter("txtAddressEmployee"));
		myEmployee.setSalaryEmployee(Double.parseDouble(request.getParameter("txtSalaryEmployee")));
		myEmployee.setDepartmentEmployee(request.getParameter("txtDepartmentEmployee"));
		

		// 1. Declaramos Variables
		String urlServer="jdbc:mysql://localhost:3306/tienda?useSSL=false&serverTimezone=UTC";
		String username="root";
		String pass="admin";
		//String sentenciaSQL="select * from productos";
		String sentenciaSQLPreparedStatement="INSERT INTO Empleados (nombreEmpleado,edadEmpleado,domicilioEmpleado,salarioEmpleado,departamentoEmpleado) VALUES (?,?,?,?,?)";
		int rowsAffected=0;
		
		// 2. Declaramos objetos
		Connection conn=null;
		PreparedStatement pstmnt=null;
		
		try {
			//3 instanciamos el driver
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			
			//4 Abrimos la conexion
			
			conn=DriverManager.getConnection(urlServer,username,pass);
			
			//5 configuramos el prepared statement
			
			pstmnt=conn.prepareStatement(sentenciaSQLPreparedStatement);
			pstmnt.setString(1, myEmployee.getNameEmployee());
			pstmnt.setInt(2, myEmployee.getAgeEmployee());
			pstmnt.setString(3, myEmployee.getAddressEmployee());
			pstmnt.setDouble(4, myEmployee.getSalaryEmployee());
			pstmnt.setString(5, myEmployee.getDepartmentEmployee());
			
			rowsAffected=pstmnt.executeUpdate();
			if(rowsAffected>0) {
				output.append("Registro añadido con exito!");
			}
			else {
				output.append("Registro No añadido!");
			}
			
		}catch(Exception e)
		{
			
			e.printStackTrace();
			
		}
		finally
		{
			try {
				pstmnt.close();
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		output.close();
	}
}
