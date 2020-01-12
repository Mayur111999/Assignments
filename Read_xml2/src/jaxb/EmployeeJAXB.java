package jaxb;

import javax.xml.bind.*;
import javax.xml.transform.Result;

import java.io.*;

public class EmployeeJAXB {

	public void marshall()
	{
		try
		{
			
			Employee emp=new Employee("101","Ram","Pune",50000);
			JAXBContext jc=JAXBContext.newInstance(Employee.class);
			Marshaller ms=jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(emp, System.out);
			ms.marshal(emp, new File("Employee.xml"));
			
		}
		catch(Exception e)
		{
			System.out.println(" "+e.getMessage());
		}
	}
	

	public void unmarshall()
	{
		try
		{
			
			JAXBContext jc=JAXBContext.newInstance(Employee.class);
			Unmarshaller ums=jc.createUnmarshaller();
			Employee emp=(Employee)ums.unmarshal(new File("Employee.xml"));
			System.out.println("Employee info");
			System.out.println("id - "+emp.getId()+" Name - "+emp.getName()+" Address - "+emp.getAddress()+" Salary - "+emp.getSalary() );

			
			
		}
		catch(Exception e)
		{
			System.out.println(" "+e.getMessage());

		}
	}
	
}
