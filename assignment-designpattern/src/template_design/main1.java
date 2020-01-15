package template_design;
//Implements Factory to initialize interface references
public class main1 {

	public static void main(String[] args)
	{
		getHouseObjFactory obj=new getHouseObjFactory(); 
		
		System.out.printf("Build Concrete-Wall House\n\n");
		 
        house house = obj.getobj("Concreate");
        house.buildhouse();

        System.out.println("Concrete-WallHouse constructed successfully");

        System.out.printf("\n\n--------------------------------------------------------------------------------------------------\n\n");

        
        
        
        System.out.printf("Build Glass-Wall House\n\n");
        house = obj.getobj("Glass");
        house.buildhouse();

        System.out.println("Glass Wall House constructed successfully");
	}
}
/*OUTPUT
Build Concrete-Wall House

Base has been constructed.
Roof has been constructed.
Constructing Concrete Wall for my House
Constructing Windows for Concrete Wall House
Constructing Doors for Concrete Wall House
Painting Concrete Wall House
Decorating Concrete Wall House
Concrete-WallHouse constructed successfully


--------------------------------------------------------------------------------------------------

Build Glass-Wall House

Base has been constructed.
Roof has been constructed.
Consruct Walls of  Glass Wall House
ConstructWindow of Glass Wall House
Construct Doors of Glass Wall House
Painting Glass Wall House
Decorating Glass Wall House
Glass Wall House constructed successfully
*/
