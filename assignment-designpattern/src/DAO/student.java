package DAO;

public class student {

	private int sno;
	private String sname;
	private float percentage;
	public student(int sn,String sn1,float p)
	{
		this.sno=sn;
		this.sname=sn1;
		this.percentage=p;
	}
	
	
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	
}
