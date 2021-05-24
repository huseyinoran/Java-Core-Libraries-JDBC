package com.corejdbc.m2c1;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectComponent {
	
	public boolean tryConnection() throws Exception{	

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?user=root&password=123456&serverTimezone=UTC")){
			// oracle connection
			//"jdbc:oracle:thin:@myhost:1521:orcl","root","123456"
			//sqlserver connection
			//"jdbc:sqlserver://localhost;" + "user=root;password=123456"

			return conn.isValid(2);
    				   
		}
    }

}
