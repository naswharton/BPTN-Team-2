package introtojava;
import java.util.Scanner;
import java.lang.Math;
public class Calculator {
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Calculator Menu");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtration");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 for finding square");
        System.out.println("Press 6 for finding square root");
        System.out.println("Press 7 for finding reciprocal");
        
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        double num1;
        double num2;
        int operation = scanner.nextInt();
        if(operation == 1) {
        	System.out.println("Enter the first number: ");
        	num1 = scanner.nextDouble();
        	scanner.nextLine();
        	System.out.println("Enter the second number: ");
        	num2 = scanner.nextDouble();
        	scanner.nextLine();
        	double sum = num1 + num2;
        	System.out.print("The sum of " + num1 + " and " + num2 + " is: " + sum);
        	
        }
        else if(operation == 2) {
        	System.out.println("Enter the first number: ");
        	num1 = scanner.nextDouble();
        	scanner.nextLine();
        	System.out.println("Enter the second number: ");
        	num2 = scanner.nextDouble();
        	scanner.nextLine();
        	double difference = num1 - num2;
        	System.out.print("The difference of " + num1 + " and " + num2 + " is: " + difference);
        }
        else if(operation == 3) {
        	System.out.println("Enter the first number: ");
        	num1 = scanner.nextDouble();
        	scanner.nextLine();
        	System.out.println("Enter the second number: ");
        	num2 = scanner.nextDouble();
        	scanner.nextLine();
        	double product = num1 * num2;
        	System.out.print("The difference of " + num1 + " and " + num2 + " is: " + product);
        }
        else if(operation == 4) {
        	System.out.println("Enter the first number: ");
        	num1 = scanner.nextDouble();
        	scanner.nextLine();
        	System.out.println("Enter the second number: ");
        	num2 = scanner.nextDouble();
        	scanner.nextLine();
        	double quotient = num1 / num2;
        	System.out.print("The difference of " + num1 + " and " + num2 + " is: " + quotient);
        }
        else if(operation == 5) {
        	System.out.println("Enter a number: ");
        	num1 = scanner.nextDouble();
        	scanner.nextLine();
        	double square = num1 * num1;
        	System.out.print("The square of " + num1 + " is " + square);
        }
        else if(operation == 6) {
        	System.out.println("Enter a number: ");
        	num1 = scanner.nextInt();
        	scanner.nextLine();
        	double squareRoot = Math.sqrt(num1);
        	System.out.print("The square root of " + num1 + " is " + squareRoot);
        }
        else if(operation == 7) {
        	System.out.println("Enter a number: ");
        	num1 = scanner.nextInt();
        	scanner.nextLine();
        	double reciprocal = 1 / num1;
        	System.out.print("The reciprocal of " + num1 + " is " + reciprocal);
        }
        else {
        	System.out.println("This is an invalid input. Choose a number between 1 and 7.");
        }
    }
}
