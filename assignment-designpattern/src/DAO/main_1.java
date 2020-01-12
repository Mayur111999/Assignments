package DAO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import Adapter.AudioPlayer;

public class main_1 {

	public static void main(String[] args) {
		
		int choice, id1;
		float p1;
		String sn;
		
	      student_dao obj=new s_dao_Imp();

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
                	  obj.AddStudent(s1);
                  }
                  break;
                  case 2:
                  {
                      obj.print();
                  }
                  break;
                  case 3:
                  {
                	  System.out.println("ENTER Student ID : - \n");
                      id1=sc.nextInt();
                      
                  
                      System.out.println("ENTER Student NEW Percentage : - \n");
                      p1=sc.nextFloat();
                    
                     obj.UpdateStud(id1, p1);
                  }
                  break;
                  case 4:
                  {
                	  System.out.println("ENTER Student ID For Delete : - \n");
                      id1=sc.nextInt();
                
                 
                  	obj.DeleteStud(id1);
                  }
                  break;
                  default: System.out.println("ENTER Correct Choice.\n");

            
              }

          }while(choice!=5);

	      
	      
	      
	      

	   }
}
