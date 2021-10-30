import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Puzzling {
	public ArrayList<Integer> randomNumber(int min, int max){
		ArrayList<Integer> random = new ArrayList<Integer>();
		int count = 10;
		int randomNumber = 0;

		for(int i=0; i<count; i++){
			Random out = new Random();
			randomNumber = min + out.nextInt(max);

			random.add(randomNumber);
		}

		return random;
	}


	// getRandomLetter
	public int getRandomLetter(){

		int index =0;

		for (int i='A'; i<='Z'; i++){
			Random al = new Random();

			// for (int j=1; j<=25; j++){
				index = al.nextInt(i) ;
			// }
		}

		return index;

	}


	// generatePassword
	public String generatePassword(){

		char[] generatedString = new char[8];
		Random r = new Random();
		int firstLetter = 97 ; 
		int lastLetter = 122;
		char randomChar;
		
		for (int i = 0; i<generatedString.length; i++){
			randomChar = (char) (firstLetter + r.nextInt(lastLetter - firstLetter + 1));
			generatedString[i] = randomChar;
		}
		
		String output = new String(generatedString);
	
		return output; 
	}

	// getNewPasswordSet
	public void getNewPasswordSet(int n){

		String [] genSetOfPasswd = new String[5];

		for (int i = 0; i<n; ++i){
			genSetOfPasswd[i] = generatePassword();
			System.out.println(genSetOfPasswd[i]);
		}
		
	}

}