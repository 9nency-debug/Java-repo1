import java.util.Scanner;

public class ExamResultChecker {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");

        int marks = scanner.nextInt();
        if (marks >= 75) {
            System.out.println("Distinction");
        } else if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
        scanner.close();
    }
}

