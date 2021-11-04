
import java.util.Scanner;
import java.io.Console;

public class BankAccountTest {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(300.00, 500.00);
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println(account.accountStatus() + "Account Nunber: " + account.accountNumber);
        System.out.println("Number of Account(s): " + BankAccount.numberOfAccounts);

        // System.out.println("Type 'quit' To Quit the App");
        // String runApp = scanner.nextLine();

        while(true){
            System.out.println("Type 'quit' To Quit or Enter to continue");
            String runApp = scanner.nextLine();

            if (runApp.equals("quit")){
                break;

            }else{
                System.out.println();
                System.out.println("Adding or Withdrawing Money");
                System.out.println("1- Add" + "\n" + "2- Withdraw" );
                System.out.print("Make you selection: ");
                int choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        
                        System.out.println("\nWhere do you want to deposit your money?");
                        System.out.println("1- Checking" + "\n" + "2- Saving" );
                        System.out.print("Make you selection: ");
                        int opt1 = scanner.nextInt();

                        switch (opt1){
                            case 1:
                                System.out.println("Checking account ");
                                System.out.print("How Much would you like to deposit: ");
                                account.depositMoneyToChecking(scanner.nextDouble());
                                break;
                            case 2: 
                                System.out.println("Saving account ");
                                System.out.print("How much would you like to deposit: ");
                                account.depositMoneyToSaving(scanner.nextDouble());
                                break;
                            default:
                                System.out.println("Wrong Input Try again !!!");
                        }
                        break;
                    case 2: 
                        
                        System.out.println("\nWhere do you want to Withdraw the money from?");
                        System.out.println("1- Checking" + "\n" + "2- Saving" );
                        System.out.print("Make you selection: ");
                        int opt2 = scanner.nextInt();

                        switch (opt2){
                            case 1:
                                System.out.println("Checking account ");
                                System.out.print("How Much would you like to withdraw: ");
                                account.withdrawMFromChecking(scanner.nextDouble());
                                break;
                            case 2: 
                                System.out.println("Saving account ");
                                System.out.print("How much would you like to withdraw: ");
                                account.withdrawFromSaving(scanner.nextDouble());
                                break;
                            default:
                                System.out.println("Wrong Input Try again !!!");
                        }
                        break;
                    default:
                        System.out.println("Wrong Input Try again !!!");
                } 
            }

            System.out.println();
            BankAccount.numberOfAccounts ++;
            System.out.println(account.accountStatus() + "Account Nunber: " + account.accountNumber);
            System.out.println("Number of Account(s): " + BankAccount.numberOfAccounts);
            
            // System.out.println("Type 'quit' To Quit or Enter to continue");
            runApp = scanner.nextLine();
            
        }


        scanner.close();
        // int choice = console.readLine("Enter input:");  
        
    }
}
