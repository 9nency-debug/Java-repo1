import java.util.Scanner;

public class OrderStatusChecker {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the order status number (1-4): ");
        
        int orderStatusNumber = scanner.nextInt();
        
        switch (orderStatusNumber) {
            case 1:
                System.out.println("Order Placed");
                break;
            case 2:
                System.out.println("Shipped");
                break;
            case 3:
                System.out.println("Out for Delivery");
                break;
            case 4:
                System.out.println("Delivered");
                break;
            default:
                System.out.println("Invalid Status");
                break;
        }
        
        scanner.close();
    }
}
