package DAO;

import java.util.ArrayList;
import java.util.List;

public class s_dao_Imp implements student_dao {
	
	private List<student> l1=new ArrayList<student>();

	
	@Override
	public List<student> getallstud() {
		if(l1.size()!=0)
		{
			return l1;
		}
		return null;
	}

	@Override
	public void DeleteStud(int id) {
		
		int i,flag=0;
		for(i=0;i<l1.size();i++)
		{
			if(l1.get(i).getSno()==id)
			{
				
				flag=1;
				break;
			}
		}
		if(flag!=1) {System.out.println("ID is not Found...");}
		else {System.out.println("Student Record deleted...");
				l1.remove(i);}
		
	}

	@Override
	public void AddStudent(student o1) {
	
		if(l1.isEmpty()) {l1.add(o1);}
		else
		{
			int i,flag=0;
		
		for(i=0;i<l1.size();i++)
		{
			if(l1.get(i).getSno()==o1.getSno())
			{
				flag=1;
				break;
			}
		}
		if(flag==1) {System.out.println("( "+o1.getSno()+" ) ID is Already Present...");}
		else {l1.add(o1);System.out.println("Student Record Added...");}
		}
	}
	

	@Override
	public void UpdateStud(int id,float percentage) {
		int i,flag=0;
		for(i=0;i<l1.size();i++)
		{
			if(l1.get(i).getSno()==id)
			{
				l1.get(i).setPercentage(percentage);
				flag=1;
				break;
			}
		}
		if(flag==1) {System.out.println("Data is Updated....");}
		else
			System.out.println("Student is not present with given ID...");
	}

	@Override
	public void print() {
		int i;
		System.out.println("STUDENT DATA : - ");
		System.out.println();
		for(i=0;i<l1.size();i++)
		{
			System.out.println("S_ID = "+l1.get(i).getSno()+"  S_Name = "+l1.get(i).getSname()+"  S_Percentage = "+l1.get(i).getPercentage());
		}
	}

}
