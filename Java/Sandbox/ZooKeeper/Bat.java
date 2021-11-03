


public class Bat extends Mammal {


    public Bat(int energyLevel) {
        super(energyLevel);
    }

    // public void setEnergyLevel(int energyLevel){
    //     energyLevel = energyLevel + 200;
    // }

    public void fly(){
        super.setEnergyLevel(super.getEnergyLevel() - 50);
        System.out.println("Bat has just taking off! " + super.energyLevel);
    }

    public void eatHumans(){
        super.setEnergyLevel(super.getEnergyLevel() + 25);
        System.out.println("Bat has eating a human! " + super.energyLevel);
    }

    public void attackTown(){
        super.setEnergyLevel(getEnergyLevel() - 100);
        System.out.println("The Bat has attached a Town! " + super.energyLevel);
    }

}
