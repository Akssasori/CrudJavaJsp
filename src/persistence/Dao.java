package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	
	Connection con;
	ResultSet rs;
	PreparedStatement stmt;
	
	public void open()throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodata","root","coti");
		
	}
	
	public void close() throws Exception{
		con.close();
	}
	

}
