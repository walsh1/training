package com.qa;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstJDBCApplication {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/danielle","root","");
		
		Statement st = con.createStatement();
		
		st.execute("CREATE table employee(id int, name varchar(20))");
		
		con.close();
		
		
		
	}
}
