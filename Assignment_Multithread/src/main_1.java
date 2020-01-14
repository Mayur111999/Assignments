import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class MultithreadingDemo extends Thread 
{ 
    public void run() 
    { 
    	Connection c1 = null;
        try
        { 
        	Class.forName("com.mysql.jdbc.Driver");
    		 c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mayur","root","root");
    		 
    		
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught "+e.getMessage()); 
        } 
        
    } 
} 
  

public class main_1 {

	
	public static void main(String args[])
	{
		  int n = 8; // Number of threads 
	        for (int i=0; i<250; i++) 
	        { 
	            MultithreadingDemo object = new MultithreadingDemo(); 
	            object.start(); 
	        } 
        
	}
}
