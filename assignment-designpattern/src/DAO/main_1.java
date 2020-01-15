package DAO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import Adapter.AudioPlayer;
//******Correction  : -   Implement all CRUD Operations on Database
public class main_1 {

	public static void main(String[] args) {
		
		int choice, id1;
		float p1;
		String sn;
		Connection con1 = null;
	      StudentDaoImp obj=new StudentDaoImp();

			try {						
				con1=obj.getConnection();				//create connection
				
				  Scanner sc=new Scanner(System.in);
				     
		          do{
		              System.out.print("========= STUDENT DATA ============ \n");
		              System.out.print("            1. ADD.              \n");
		              System.out.print("            2. PRINT.              \n");
		              System.out.print("            3. UPDATE.            \n");
		              System.out.print("            4. DELETE.                     \n");
		              System.out.print("            5. EXIT.                     \n");

		              System.out.print("Enter your choice: ");

		              choice=sc.nextInt();
		            

		              switch (choice) {
		                  case 1:
		                  {
		                      System.out.println("ENTER Student ID : - ");
		                      id1=sc.nextInt();
		                   
		                      System.out.println("ENTER Student Name : - ");
		                      sc.nextLine();
		                      sn=sc.nextLine();
		                      System.out.println("ENTER Student Percentage : - ");
		                      p1=sc.nextFloat();
		                      
		                      student s1=new student(id1,sn,p1);
		                	  obj.AddStudent(s1,con1);
		                  }
		                  break;
		                  case 2:
		                  {
		                      obj.print(con1);
		                  }
		                  break;
		                  case 3:
		                  {
		                	  
		                	  System.out.println("ENTER Student ID : - \n");
		                      id1=sc.nextInt();
		                      
		                  
		                      System.out.println("ENTER Student NEW Percentage : - \n");
		                      p1=sc.nextFloat();
		                    
		                     obj.UpdateStud(id1, p1,con1);
		                  }
		                  break;
		                  case 4:
		                  {
		                	  System.out.println("ENTER Student ID For Delete : - \n");
		                      id1=sc.nextInt();
		                
		                 
		                  	obj.DeleteStud(id1,con1);
		                  }
		                  
		                  break;
		                  default: System.out.println("ENTER Correct Choice.\n");

		            
		              }

		          }while(choice!=5);
				
				
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally
			{
				try {
					con1.close();							//close connection
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

        

	      
	      
	      
	      

	   }
}

/*
 * OUTPUT:-
Wed Jan 15 16:38:12 IST 2020 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
========= STUDENT DATA ============ 
            1. ADD.              
            2. PRINT.              
            3. UPDATE.            
            4. DELETE.                     
            5. EXIT.                     
Enter your choice: 1
ENTER Student ID : - 
101
ENTER Student Name : - 
mayur
ENTER Student Percentage : - 
88
A new user was inserted successfully!
========= STUDENT DATA ============ 
            1. ADD.              
            2. PRINT.              
            3. UPDATE.            
            4. DELETE.                     
            5. EXIT.                     
Enter your choice: 1
ENTER Student ID : - 
102
ENTER Student Name : - 
ram
ENTER Student Percentage : - 
89
A new user was inserted successfully!
========= STUDENT DATA ============ 
            1. ADD.              
            2. PRINT.              
            3. UPDATE.            
            4. DELETE.                     
            5. EXIT.                     
Enter your choice: 2
Wed Jan 15 16:38:43 IST 2020 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
S_ID = 101  S_Name = mayur  S_Percentage = 88.0
S_ID = 102  S_Name = ram  S_Percentage = 89.0
========= STUDENT DATA ============ 
            1. ADD.              
            2. PRINT.              
            3. UPDATE.            
            4. DELETE.                     
            5. EXIT.                     
Enter your choice: 3
ENTER Student ID : - 

102
ENTER Student NEW Percentage : - 

99
An existing user was updated successfully!
========= STUDENT DATA ============ 
            1. ADD.              
            2. PRINT.              
            3. UPDATE.            
            4. DELETE.                     
            5. EXIT.                     
Enter your choice: 2
Wed Jan 15 16:38:54 IST 2020 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
S_ID = 101  S_Name = mayur  S_Percentage = 88.0
S_ID = 102  S_Name = ram  S_Percentage = 99.0
========= STUDENT DATA ============ 
            1. ADD.              
            2. PRINT.              
            3. UPDATE.            
            4. DELETE.                     
            5. EXIT.                     
Enter your choice: 4
ENTER Student ID For Delete : - 

102
A user was deleted successfully!
========= STUDENT DATA ============ 
            1. ADD.              
            2. PRINT.              
            3. UPDATE.            
            4. DELETE.                     
            5. EXIT.                     
Enter your choice: 2
Wed Jan 15 16:39:04 IST 2020 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
S_ID = 101  S_Name = mayur  S_Percentage = 88.0
========= STUDENT DATA ============ 
            1. ADD.              
            2. PRINT.              
            3. UPDATE.            
            4. DELETE.                     
            5. EXIT.                     
Enter your choice: 
	*/
