package Clone_Solution;

//solution to clone method
//implements Cloneable interface and override clone method return same Object
class Singleton implements Cloneable
{ 
  public static Singleton i1 = new Singleton(); 
  
  private Singleton()  
  { 
  } 
  
  @Override
  protected Object clone() throws CloneNotSupportedException  
  { 
    return i1; 
  } 
} 



public class main_1 {
	 public static void main(String[] args) throws CloneNotSupportedException  
	  { 
	    Singleton instance1 = Singleton.i1; 
	    Singleton instance2 = (Singleton) instance1.clone(); 
	    System.out.println("instance1 hashCode:- " 
	                           + instance1.hashCode()); 
	    System.out.println("instance2 hashCode:- "
	                           + instance2.hashCode());  
	  } 

}


//OUTPUT: - 
//instance1 hashCode,:- 918221580
//instance2 hashCode:- 918221580


