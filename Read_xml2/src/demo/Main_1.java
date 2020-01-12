


//Read xml file using JAXB

package demo;
import jaxb.*;

public class Main_1 {
	
	public static void main(String[] args)
	{
	EmployeeJAXB obj=new EmployeeJAXB();
	obj.marshall();
	obj.unmarshall();

	}
}
