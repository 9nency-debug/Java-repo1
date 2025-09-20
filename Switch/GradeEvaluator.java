import java.util.Scanner;

public class GradeEvaluator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a grade (A, B, C, or D): ");
        
        char grade = scanner.next().toUpperCase().charAt(0);
        
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            default:
                System.out.println("Invalid Grade");
                break;
        }
        
        scanner.close();
    }
}

