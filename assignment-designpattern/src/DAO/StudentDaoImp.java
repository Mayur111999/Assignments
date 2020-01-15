package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImp implements student_dao {
	

	Connection c1;
	
	static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dao","root","root");

		return con;
	}
	
	
	

	@Override
	public void DeleteStud(int id,Connection c1)  {
		
		try {
			String s=Integer.toString(id);

			String sql = "DELETE FROM student WHERE Sid=?";
			 
			PreparedStatement statement = c1.prepareStatement(sql);
			statement.setString(1,s);
			 
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
			    System.out.println("A user was deleted successfully!");
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void AddStudent(student o1,Connection c1) {
	

		try {
			String s=Integer.toString(o1.getSno());
			String sn=o1.getSname();
			String sp=Float.toString(o1.getPercentage());

			String sql = "INSERT INTO student (Sid,Sname,Spercentage) VALUES (?, ?, ?)";
			 
			PreparedStatement statement = c1.prepareStatement(sql);
			statement.setString(1, s);
			statement.setString(2, sn);
			statement.setString(3, sp);
			 
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new user was inserted successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	

	@Override
	public void UpdateStud(int id,float percentage,Connection c1) {
		try {
			String s=Integer.toString(id);
			String s2=Float.toString(percentage);

			String sql = "UPDATE student SET  Spercentage=? WHERE Sid=?";
			PreparedStatement statement = c1.prepareStatement(sql);
			statement.setString(1, s2);
			statement.setString(2, s);
		
			 
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
			    System.out.println("An existing user was updated successfully!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		
	}

	@Override
	public void print(Connection c1) {
		
		try {
			String sql = "SELECT * FROM student";
			c1=StudentDaoImp.getConnection();
			String id,name,percen;
			Statement statement = c1.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			     id = result.getString(1);
			     name = result.getString(2);
			     percen = result.getString(3);
			 
			 
			    System.out.println("S_ID = "+id+"  S_Name = "+name+"  S_Percentage = "+percen);
			}


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	

}
