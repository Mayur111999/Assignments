package template_design;


//Concrete implementation of override methods
public class Glass_WallHouse extends house {

	@Override
	public void decorateHouse() {
		System.out.println("Decorating Glass Wall House");
		
	}

	@Override
	public void paintHouse() {
		System.out.println("Painting Glass Wall House");
	}

	@Override
	public void constructDoors() {
		System.out.println("Construct Doors of Glass Wall House");
	}

	@Override
	public void constructWindows() {
		System.out.println("ConstructWindow of Glass Wall House");
	}

	@Override
	public void constructWalls() {
		System.out.println("Consruct Walls of  Glass Wall House");
		
	}

}
