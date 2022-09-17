import java.util.Scanner;

public class Calculator {
    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        String operation = "";

        while (true) {
            try {
                System.out.print("What is number 1: ");
                number1 = scanner.nextDouble();
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Please put in a number.");
            }
        }

        while (true) {
            System.out.print("What operator will you use: ");
            operation = scanner.next();
            if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
                break;
            }
            scanner.nextLine();
            System.out.println("Please type in +, -, *, or /");
        }

        while (true) {
            try {
                System.out.print("What is number 2: ");
                number2 = scanner.nextDouble();
                break;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Please put in a number.");
            }
        }

        switch (operation) {
            case "+":
                System.out.println("Result: " + add(number1, number2));
                break;
            case "-":
                System.out.println("Result: " + subtract(number1, number2));
                break;
            case "*":
                System.out.println("Result: " + multiply(number1, number2));
                break;
            case "/":
                System.out.println("Result: " + divide(number1, number2));
                break;
        }
    }
}
