
public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla gorilla = new Gorilla(100);
		
		gorilla.throwSomthing();
		gorilla.throwSomthing();
		gorilla.throwSomthing();
		
		gorilla.eatBananas();
		gorilla.eatBananas();
		gorilla.climb();
		
		System.out.println("The updated Energy level is: " + gorilla.displayEnergy());

	}

}
