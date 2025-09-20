import java.util.Scanner;

public class ElectricityBillCalc1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int category;
        int units;
        double billAmount = 0.0;
        
        System.out.println("Enter the electricity category:");
        System.out.println("1: Rs. 5/unit");
        System.out.println("2: Rs. 8/unit");
        System.out.println("3: Rs. 10/unit");
        System.out.print("Enter category (1, 2, or 3): ");
        category = scanner.nextInt();
        
        System.out.print("Enter the number of units consumed: ");
        units = scanner.nextInt();
        if (category < 1 || category > 3) {
            System.out.println("Invalid category.");
        }

        else if (units < 0) {
            System.out.println("Units consumed cannot be negative.");
        }
        else {
            switch (category) {
                case 1:
                    billAmount = units * 5;
                    break;
                case 2:
                    billAmount = units * 8;
                    break;
                case 3:
                    billAmount = units * 10;
                    break;
            }
            System.out.println("Total bill: Rs. " + (int) billAmount);
        }
        
        scanner.close();
    }
}
