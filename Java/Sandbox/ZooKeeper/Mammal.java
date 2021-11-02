
public class Mammal {
	int energyLevel = 100;

    public Mammal (int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int displayEnergy(){
        System.out.println("Energy Level: " + energyLevel);
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int getEnergyLevel(){
        return energyLevel;
    }
}
