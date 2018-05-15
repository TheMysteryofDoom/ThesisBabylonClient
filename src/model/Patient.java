package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Patient {
	private String patientCardID;
	private int pinID;
	private boolean exist;
	
	
		

	public Patient(String patientCardID, int pinID, boolean exist) {
		super();
		this.patientCardID = patientCardID;
		this.pinID = pinID;
		this.exist = exist;
	}
	public String getPatientCardID() {
		return patientCardID;
	}
	public void setPatientCardID(String patientCardID) {
		this.patientCardID = patientCardID;
	}
	public int getPinID() {
		return pinID;
	}
	public void setPinID(int pinID) {
		this.pinID = pinID;
	}
	public boolean isExist() {
		return exist;
	}
	
	public Patient isExist(Connection connection, String card){
		Patient record = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/codersofbabylon2","root","");
			
			PreparedStatement ps = con.prepareStatement("SELECT * FROM patient "
					+ "WHERE patientCardID LIKE " + card);
			
			//ps.setString(1, );
			ResultSet rs = ps.executeQuery();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return record;
		
		
		
	}
	
	
	
	

}
