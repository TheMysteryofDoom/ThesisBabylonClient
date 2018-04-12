package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utility.SQLCommand;

public class MasterRetrieve implements SQLCommand{
	public static PreparedStatement statement;
	public static Connection connection;
	
	public void EstablishConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/codersofbabylon","root","");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		} catch (SQLException sqle) {
			System.err.println("SQLE - " + sqle.getMessage());
			sqle.printStackTrace();
		}
	}
	
	public static ResultSet RetrievePatient(String id){
		String url = "";
		ResultSet patient = null;
		
		
		try {
			statement =  connection.prepareStatement(Get_Patient);
			
			patient = statement.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
