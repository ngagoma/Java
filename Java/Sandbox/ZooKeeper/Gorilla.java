

public class Gorilla extends Mammal{
	
//	public Gorilla() {}
	
	public Gorilla(int energyLevel){
        super(energyLevel);
    }

    public void throwSomething(){
        super.setEnergyLevel(super.getEnergyLevel()-5);
        System.out.println("The Gorilla has thrown something!");
        
    }

    public void eatBananas (){
    	super.setEnergyLevel(super.getEnergyLevel() + 10);
        System.out.println("The Gorilla has eating");
        // super.energyLevel += 5;
    }

    public void climb(){
    	super.setEnergyLevel(super.getEnergyLevel()- 10);
        System.out.println("The Gorilla has climbed a Tree");
    }
}

