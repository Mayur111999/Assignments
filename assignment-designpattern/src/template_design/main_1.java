package template_design;

public class main_1 {

	public static void main(String[] args)
	{
		System.out.printf("Build Concrete-Wall House\n\n");
		 
        house house = new Concrete_WallHouse();
        house.buildhouse();

        System.out.println("Concrete-WallHouse constructed successfully");

        System.out.printf("\n\n--------------------------------------------------------------------------------------------------\n\n");

        System.out.printf("Build Glass-Wall House\n\n");

        house = new Glass_WallHouse();
        house.buildhouse();

        System.out.println("Glass Wall House constructed successfully");
	}
}
