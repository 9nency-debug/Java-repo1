import java.util.Scanner;

public class TrainTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int age = -1;
        for (; ; ) {
            System.out.print("Enter your age: ");
            try {
                age = scanner.nextInt();
                if (age >= 0) {
                    break; 
                } else {
                    System.out.println("Age cannot be negative. Please enter again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
            }
        }
        scanner.nextLine();
        System.out.print("Enter your berth preference (Lower, Middle, or Upper): ");
        String berthPreference = scanner.nextLine().trim();
        
        if (age < 5) {
            System.out.println("Output: Children below 5 travel for free");
        } else if (berthPreference.equalsIgnoreCase("Lower") || 
        berthPreference.equalsIgnoreCase("Middle") ||
        berthPreference.equalsIgnoreCase("Upper")) {
            System.out.println("Output: Ticket Booked Successfully");
        } else {
            System.out.println("Output: Invalid Berth Preference");
        }
        scanner.close();
    }
}
