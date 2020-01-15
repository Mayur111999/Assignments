class main1
{ 
    public static void main(String args[]) 
    { 
        Sparrow sparrow = new Sparrow(); 
        ToyDuck toyDuck = new PlasticToyDuck(); 
  
        // Wrap a bird in a birdAdapter so that it  
        // behaves like toy duck 
        ToyDuck birdAdapter = new BirdAdapter(sparrow); 
  
        System.out.println("Run Simple Sparrow Implements Bird..."); 
        sparrow.fly(); 
        sparrow.makeSound(); 
  
        System.out.printf("\nSimple ToyDuck...\n"); 
        toyDuck.squeak(); 
  
        // toy duck behaving like a bird  
        System.out.printf("\n\nBirdAdapter...\n"); 
        birdAdapter.squeak(); 
    } 
} 

/*
 OUTPUT: - 
 
Run Simple Sparrow Implements Bird...
Flying 
Chirp Chirp

Simple ToyDuck...
Squeak


BirdAdapter...
Chirp Chirp

*/