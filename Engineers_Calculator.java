import java.util.Scanner;

public class Engineers_Calculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Engineers Calculator");
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Sine");
            System.out.println("7. Cosine");
            System.out.println("8. Tangent");
            System.out.println("9. Exponentiation");
            System.out.println("10. Logarithm (base 10)");
            System.out.println("11. Natural Logarithm");
            System.out.println("12. Factorial");
            System.out.println("13. Exit");

            choice = scnr.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter first number: ");
                    double add1 = scnr.nextDouble();
                    System.out.print("Enter second number: ");
                    double add2 = scnr.nextDouble();
                    System.out.println("Result: " + (add1 + add2));
                    break;

                case "2":
                    System.out.print("Enter first number: ");
                    double sub1 = scnr.nextDouble();
                    System.out.print("Enter second number: ");
                    double sub2 = scnr.nextDouble();
                    System.out.println("Result: " + (sub1 - sub2));
                    break;

                case "3":
                    System.out.print("Enter first number: ");
                    double mul1 = scnr.nextDouble();
                    System.out.print("Enter second number: ");
                    double mul2 = scnr.nextDouble();
                    System.out.println("Result: " + (mul1 * mul2));
                    break;

                case "4":
                    System.out.print("Enter first number: ");
                    double div1 = scnr.nextDouble();
                    System.out.print("Enter second number: ");
                    double div2 = scnr.nextDouble();
                    if (div2 != 0) {
                        System.out.println("Result: " + (div1 / div2));
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;

                case "5":
                    System.out.print("Enter a number: ");
                    double sqrtNum = scnr.nextDouble();
                    if (sqrtNum >= 0) {
                        System.out.println("Result: " + Math.sqrt(sqrtNum));
                    } else {
                        System.out.println("Error: Cannot compute square root of a negative number.");
                    }
                    break;

                case "6":
                    System.out.print("Enter an angle in radians: ");
                    double sineAngle = scnr.nextDouble();
                    System.out.println("Result: " + Math.sin(sineAngle));
                    break;

                case "7":
                    System.out.print("Enter an angle in radians: ");
                    double cosineAngle = scnr.nextDouble();
                    System.out.println("Result: " + Math.cos(cosineAngle));
                    break;

                case "8":
                    System.out.print("Enter an angle in radians: ");
                    double tangentAngle = scnr.nextDouble();
                    System.out.println("Result: " + Math.tan(tangentAngle));
                    break;

                case "9":
                    System.out.print("Enter base: ");
                    double base = scnr.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scnr.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exponent));
                    break;

                case "10":
                    System.out.print("Enter a number: ");
                    double logNum = scnr.nextDouble();
                    if (logNum > 0) {
                        System.out.println("Result: " + Math.log10(logNum));
                    } else {
                        System.out.println("Error: Logarithm is undefined for non-positive numbers.");
                    }
                    break;

                case "11":
                    System.out.print("Enter a number: ");
                    double naturalLogNum = scnr.nextDouble();
                    if (naturalLogNum > 0) {
                        System.out.println("Result: " + Math.log(naturalLogNum));
                    } else {
                        System.out.println("Error: Natural logarithm is undefined for non-positive numbers.");
                    }
                    break;

                case "12":
                    System.out.print("Enter a non-negative integer: ");
                    int factNum = scnr.nextInt();
                    if (factNum < 0) {
                        System.out.println("Error: Factorial is not defined for negative numbers.");
                    } else {
                        System.out.println("Result: " + factorial(factNum));
                    }
                    break;

                case "13":
                    System.out.println("Exiting the calculator.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            scnr.nextLine();
        } while (!choice.equals("13"));

        scnr.close();
    }

    private static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
