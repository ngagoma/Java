


public class Galaxy extends Phone implements Ringable {

    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    
    }
    
    @Override
    public String ring() {
        return "Galaxy S9 Says Ring Ring Ring";
    }
    
    @Override
    public String unlock() {
        return "Unlocking via Finger Print! ";
    }

    @Override
    public void displayInfo() {
        System.out.println("Galaxy S9 From Verizon !");        
    }

}

