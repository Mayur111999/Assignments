package Singleton;

class main_1
{
	
	
	public static void main(String[] args)
	{
		SingletonClass obj1=SingletonClass.getInstance();
		SingletonClass obj2=SingletonClass.getInstance();

		obj1.a=100;
		
		System.out.println("value in obj1 "+obj1.a);
		System.out.println("value in obj2 "+obj2.a);

		
		//singleton_class obj2=new singleton_class();
		//Error as singleton_class has private constructor
		//in this way only one instance created for singleton_class
		
		
	}
	
}

/*OUTPUT : - 
Unique instance is created....
value in obj1 100
value in obj2 100
*/