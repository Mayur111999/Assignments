package Singleton;

public class SingletonClass {
	

	int a;

	
	 
	  private static final SingletonClass instance1 = new SingletonClass(); 
	 
	  private SingletonClass()
	  {
		  System.out.println("Unique instance is created....");
	  }
	  public static SingletonClass getInstance(){ 
	        return instance1; 
	  }

}

