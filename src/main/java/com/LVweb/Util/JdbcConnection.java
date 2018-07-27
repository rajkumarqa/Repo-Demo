package com.LVweb.Util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		
		//Syntax: jdbc:sqlserver://localhost\\sqlexpress"
		//jdbc:sqlserver://[serverName[\instanceName][:portNumber]][;property=value[;property=value]]
		String dbURL = "jdbc:sqlserver://RAJKUMAR-PC\\SQLEXPRESS14;databaseName=Cayman";
        String user = "sa";
        String pass = "Apt@2013";
        
        
       
        Connection con =DriverManager.getConnection(dbURL, user, pass);
        
        Statement s =con.createStatement();
        
          ResultSet rs= s.executeQuery("Select top 10 * from address");
        
        
       
        while(rs.next())
       {
    	 System.out.println("hi");  
    	 
    	 
    	 
    	 
       System.out.println(rs.getString("erid")+ " "+rs.getString("noee")+ " " +rs.getString("city")); 


       }
       
     
        
        
		

	}

	
}
