package Solution;

import java.io.FileInputStream; 
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutput; 
import java.io.ObjectOutputStream; 
import java.io.Serializable; 
  //Solution to serialization
class Singleton implements Serializable  
{ 
    public static Singleton instance1 = new Singleton(); 
      
    private Singleton()  
    { 
    } 
      
    // implement readResolve method 
    protected Object readResolve() 
    { 
        return instance1; 
    } 
} 
  

public class serialization_solution {

    public static void main(String[] args)  
    { 
    	 ObjectOutput  out = null;
    	 ObjectInput in = null;
        try
        { 
            // Serailize object to file 

            Singleton instance1 = Singleton.instance1; 
            out=new ObjectOutputStream(new FileOutputStream("D:\\file.text")); 
            out.writeObject(instance1); 
            out.close(); 
          
            // Deserailize from file to object 
            
            in  = new ObjectInputStream(new FileInputStream("D:\\file.text")); 
            Singleton instance2 = (Singleton) in.readObject(); 
            in.close(); 
          
            System.out.println("instance1 hashCode:- " + instance1.hashCode()); 
            System.out.println("instance2 hashCode:- " + instance2.hashCode()); 
        }  
          
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        } 
        finally
        {
        	try {
            	out.close();
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    } 
	
}

/*output: - 
instance1 hashCode:- 1128032093
instance2 hashCode:- 1128032093
*/