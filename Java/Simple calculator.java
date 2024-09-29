import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        try {
            switch (operator) {
                case '+': System.out.println("Result: " + (num1 + num2)); break;
                case '-': System.out.println("Result: " + (num1 - num2)); break;
                case '*': System.out.println("Result: " + (num1 * num2)); break;
                case '/': 
                    if (num2 == 0) throw new ArithmeticException("Cannot divide by zero");
                    System.out.println("Result: " + (num1 / num2));
                    break;
                default: System.out.println("Invalid operator");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}