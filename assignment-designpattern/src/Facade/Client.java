/**
 * 
 */
package Facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
	private static int  choice;  
    public static void main(String args[]) throws NumberFormatException, IOException{  
        do{       
            System.out.print("========= Mobile Shop ============ \n");  
            System.out.print("            1. IPHONE.              \n");  
            System.out.print("            2. SAMSUNG.              \n");  
            System.out.print("            3. BLACKBERRY.            \n");  
            System.out.print("            4. Exit.                     \n");  
            System.out.print("Enter your choice: ");  
              
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            choice=Integer.parseInt(br.readLine());  
            ShopKeeper sk=new ShopKeeper();  
              
            switch (choice) {  
            case 1:  
                {   
                  sk.iphoneSale();  
                    }  
                break;  
       case 2:  
                {  
                  sk.samsungSale();        
                    }  
                break;    
       case 3:  
                           {  
                           sk.blackberrySale();       
                           }  
                   break;     
            default:  
            {    
                System.out.println("Nothing You purchased");  
            }         
                return;  
            }  
              
      }while(choice!=4);  
   }  
}
/*
OUTPUT : - 
========= Mobile Shop ============ 
            1. IPHONE.              
            2. SAMSUNG.              
            3. BLACKBERRY.            
            4. Exit.                     
Enter your choice: 1
 Iphone 6 
 Rs 65000.00 
========= Mobile Shop ============ 
            1. IPHONE.              
            2. SAMSUNG.              
            3. BLACKBERRY.            
            4. Exit.                     
Enter your choice: 2
 Samsung galaxy tab 3 
 Rs 45000.00 
========= Mobile Shop ============ 
            1. IPHONE.              
            2. SAMSUNG.              
            3. BLACKBERRY.            
            4. Exit.                     
Enter your choice: 3
 Blackberry Z10 
 Rs 55000.00 
========= Mobile Shop ============ 
            1. IPHONE.              
            2. SAMSUNG.              
            3. BLACKBERRY.            
            4. Exit.                     
Enter your choice: 4
Nothing You purchased

*/
