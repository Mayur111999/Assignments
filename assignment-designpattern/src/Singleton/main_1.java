package Singleton;

class main_1
{
	
	
	public static void main(String[] args)
	{
		singleton_class obj1=singleton_class.getInstance();
		singleton_class obj2=singleton_class.getInstance();

		//singleton_class obj2=new singleton_class();
		//Error as singleton_class has private constructor
		//in this way only one instance created for singleton_class
		
		
	}
}
