package template_design;

//factory method to create appropriate object
public class getHouseObjFactory {
	
	public house getobj(String s)
	{
		
		if(s.equalsIgnoreCase("Glass"))return new GlassWallHouse();
		else if(s.equalsIgnoreCase("Concreate"))return new ConcreteWallHouse();
		else return null;
	}

}
