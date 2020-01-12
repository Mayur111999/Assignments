package DAO;

import java.util.List;

public interface student_dao {
	
	public List<student> getallstud();
	public void DeleteStud(int id);
	public void AddStudent(student o1);
	public void UpdateStud(int id,float p1);
	public void print();

}
