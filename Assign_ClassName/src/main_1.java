//create object using class.forname
public class main_1 {
	int a=10;
    public static void main(String[] args) 
    { 
        try
        { 
            Class cls = Class.forName("main_1"); //Loads the class in java
            main_1 obj =  (main_1) cls.newInstance(); //using newInstance Method to crate object
            System.out.println("Value of a : - "+obj.a); 
        } 
        catch (ClassNotFoundException e) 
        { 
            e.printStackTrace(); 
        } 
        catch (InstantiationException e) 
        { 
            e.printStackTrace(); 
        } 
        catch (IllegalAccessException e) 
        { 
            e.printStackTrace(); 
        } 
}
}

// OUTPUT:-Value of a : -  10
