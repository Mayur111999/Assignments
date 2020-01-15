package DAO;

import java.sql.Connection;
import java.util.List;

public interface student_dao {
	
	public void DeleteStud(int id,Connection c);
	public void AddStudent(student o1,Connection c);
	public void UpdateStud(int id,float p1,Connection c);
	public void print(Connection c);

}
