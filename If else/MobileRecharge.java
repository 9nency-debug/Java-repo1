import java.util.Scanner;
public class MobileRecharge {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Mobile Recharge Validation:");

    int amount;
    while(true) {
        System.out.print("Enter Recharge amount (Min. Rs. 10 and Max. Rs. 5000): ");
        if(scanner.hasNextInt()) {
            amount = scanner.nextInt();
            break;
        }
        else {
            System.out.println("Invalide input. Please enter a whole number");
            scanner.next();
        }
    }
    scanner.close();

    if(amount < 10 || amount > 5000) {
        System.out.println("Invalide Recharge Amount ");
    } else if(amount % 10!=0) {
        System.out.println("Enter Amount in multiple of 10");
    } else {
        System.out.println("Recharge Successfull");
    }
}
}

