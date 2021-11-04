import java.util.stream.Stream;
import java.util.Random;

public class BankAccount {
    private double checkingBalance = 0.0;
    private double savingsBalance = 0.0;

    public static int numberOfAccounts = 0;
    public static double moneyInAccount = 0.0;

    public String accountNumber = "";

    public BankAccount(double checkingBalanceParam, double savingsBalanceParam) {
        this.checkingBalance = checkingBalanceParam;
        this.savingsBalance = savingsBalanceParam;
        this.accountNumber = generatePassword();
        numberOfAccounts++;
    }

    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    //  Deposit money into Savind account
    public void depositMoneyToSaving(double addMoney){
        setSavingsBalance(getSavingsBalance() + addMoney);
    }

    // Deposit money into Checking account
    public void depositMoneyToChecking(double addMoney){
        setCheckingBalance(getCheckingBalance() + addMoney);
    }

    // Withdraw Money checking
    public void withdrawMFromChecking(double withdrawMoney){
        if(getCheckingBalance() >= withdrawMoney){
            setCheckingBalance(getCheckingBalance() - withdrawMoney);
        }else{
            System.out.println("Insufficient Fund in your account" + 
                                "Account status is: " + getCheckingBalance());
        }
    }

    public void withdrawFromSaving(double withdrawMoney){
        if(getSavingsBalance() >= withdrawMoney){
            setSavingsBalance(getSavingsBalance() - withdrawMoney);
        }else{
            System.out.println("Insufficient Fund in your account" + 
                                "Account status is: " + getSavingsBalance());
        }
    }

    // generatePassword
	public String generatePassword(){

		char[] generatedString = new char[10];
		Random r = new Random();
		char firstNumber = 65 ; 
		int lastNumber = 92;
		char randomChar;
		
		for (int i = 0; i<generatedString.length; i++){
			randomChar = (char)(firstNumber + r.nextInt(lastNumber - firstNumber + 1));
			generatedString[i] = randomChar;
		}
		
		String output = new String(generatedString);
	
		return output; 
	}

    public String accountStatus(){
        return String.format("Account Status:"+ "\n" 
                            + "Checking %f" + "\n"
                            + "Saving %f " + "\n"
                            + "Number of Account ", getCheckingBalance(), getSavingsBalance(), BankAccount.numberOfAccounts);
    }




}
