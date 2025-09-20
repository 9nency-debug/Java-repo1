import java.util.Scanner;

public class CabFareEstimator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cab Fare Estimator");
        
        int distance = 0;
        while (true) {
            System.out.print("Enter distance in kilometers: ");
            if (scanner.hasNextInt()) {
                distance = scanner.nextInt();
                if (distance > 0) {
                    break;
                } else {
                    System.out.println("Distance must be a positive number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next();
            }
        }
        
        int hour = 0;
        while (true) {
            System.out.print("Enter the hour of travel (0-23): ");
            if (scanner.hasNextInt()) {
                hour = scanner.nextInt();
                if (hour >= 0 && hour <= 23) {
                    break;
                } else {
                    System.out.println("Hour must be between 0 and 23.");
                }
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next();
            }
        }
        
        scanner.close();
        
        int fare;
        
        if (hour >= 17 && hour <= 21) {
            fare = distance * 20;
        } else {
            fare = distance * 15;
        }
        
        System.out.println("Rs." + fare);
    }
}

