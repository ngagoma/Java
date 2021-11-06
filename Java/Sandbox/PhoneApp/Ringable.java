

public interface Ringable{
    
   public default String ring(){
        return "Phone Ringing !";
    }
   public default String unlock(){
        return "Phone Unlocked !";
    } 
}


