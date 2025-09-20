import java.util.Scanner;

public class AtmW {

    public static void main(String[] args) {
        
        int balance = 3000;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("This is a ATM Withdrawal Validator");
        System.out.println("Your current balance is: Rs. " + balance);
        
        int withdrawalAmount = 0;
        while (true) {
            System.out.print("Enter amount to withdraw: Rs. ");
            if (scanner.hasNextInt()) {
                withdrawalAmount = scanner.nextInt();
                break;
                } else {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next(); 
            }
        }
        
        scanner.close();
        
        if (withdrawalAmount % 100 != 0) {
            System.out.println("Amount should be a multiple of 100");
        } else if (withdrawalAmount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            
            balance = balance - withdrawalAmount;
            System.out.println("Withdrawal Successful");
            System.out.println("Your new balance is: Rs. " + balance);
        }
    }
}
