import java.util.Scanner;
import java.util.InputMismatchException;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        
        System.out.println("Simple Calculator");
        
        double a = getDoubleInput(scanner, "Enter first number: ");
        
        
        double b = getDoubleInput(scanner, "Enter second number: ");
        
        
        char operator = getOperatorInput(scanner, "Enter an operator among (+, -, *, /): ");
        
        switch (operator) {
            case '+':
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        
        scanner.close();
    }
    
    private static double getDoubleInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }

    
    private static char getOperatorInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.next();
            if (input.length() == 1) {
                char op = input.charAt(0);
                if (op == '+' || op == '-' || op == '*' || op == '/') {
                    return op;
                }
            }
            System.out.println("Error: Invalid operator. Please enter one of (+, -, *, /).");
        }
    }
}
