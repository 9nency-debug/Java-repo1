import java.util.Scanner;

public class ECDCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("This is a E-Commerce Discount Calculator");
        
        System.out.print("Are you a member? (true/false): ");
        boolean isMember = scanner.nextBoolean();
        
        System.out.print("Enter your cart amount: Rs. ");
        double cartAmount = scanner.nextDouble();
        
        scanner.close();
        
        double discountAmount = 0.0;
        
        if (isMember) {
            if (cartAmount > 5000) {
                discountAmount = cartAmount * 0.20;
            } else {
                discountAmount = cartAmount * 0.10;
            }
        } else {
            discountAmount = cartAmount * 0.05;
        }
        
        System.out.println("Output: Discount: Rs. " + discountAmount);
    }
}
