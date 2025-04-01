import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter AccountHolder Name: ");
        String accountHolderName=scanner.nextLine();
        System.out.println("Enter accountNumber");
        String accountNumber=scanner.nextLine();
        Bank myBankAccount = new Bank(accountHolderName,accountNumber);
        System.out.println("Enter Deposit Amount");
        int account1=scanner.nextInt();
        System.out.println("Enter Withdrawl Amount:");
        int Width=scanner.nextInt();
        double b1=myBankAccount.deposit(account1);
        System.out.println("Remaining Balance: " + b1);
           double b2= myBankAccount.withdraw(Width);


        System.out.println("CURRENT  Balance: " +b2);

        }

}