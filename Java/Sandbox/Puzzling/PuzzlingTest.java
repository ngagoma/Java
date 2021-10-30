public class PuzzlingTest {
    
	public static void main(String[] args) {

        Puzzling random = new Puzzling();
		Puzzling index = new Puzzling();
		Puzzling genPwd = new Puzzling();
		Puzzling getPwdSet = new Puzzling();
		
		System.out.println("\nrandomNumber");
	    System.out.println(random.randomNumber(1,20));

		System.out.println("\ngetRandomLetter");
		System.out.println(index.getRandomLetter());

		System.out.println("\ngeneratePassword");
		System.out.println(genPwd.generatePassword());

		System.out.println("\ngetNewPasswordSet");
		getPwdSet.getNewPasswordSet(5);

	}

}
