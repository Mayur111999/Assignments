package template_design;


//Template for Glass_WallHouse and Concrete_WallHouse Class


public abstract class house {
	
	
	
	public abstract void decorateHouse();
	 
    public abstract void paintHouse();
 
    public abstract void constructDoors();
 
    public abstract void constructWindows();
 
    public abstract void constructWalls();
 
   
    private final void constructRoof() {
        System.out.println("Roof has been constructed.");
    }
 

    private final void constructBase() {
        System.out.println("Base has been constructed.");
    }
    
    
	public final void buildhouse() {
        constructBase();
        constructRoof();
        constructWalls();
        constructWindows();
        constructDoors();
        paintHouse();
        decorateHouse();
    }
 
}
