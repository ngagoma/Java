

public class BatTest {
    public static void main(String[] args) {
        Bat bat = new Bat(300);

        System.out.println("The updated energy level is " + bat.energyLevel);

        bat.attackTown();
        bat.attackTown();
        bat.attackTown();

        bat.eatHumans();
        bat.eatHumans();

        bat.fly();
        bat.fly();

        System.out.println("The updated energy level is " + bat.displayEnergy());
    }
}
