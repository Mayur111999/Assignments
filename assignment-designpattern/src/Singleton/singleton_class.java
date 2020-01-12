package Singleton;

public class singleton_class {
	


	
	 
	  private static final singleton_class instance1 = new singleton_class(); 
	 
	  private singleton_class()
	  {
		  System.out.println("Unique instance is created....");
	  }
	  public static singleton_class getInstance(){ 
	        return instance1; 
	  }

}

