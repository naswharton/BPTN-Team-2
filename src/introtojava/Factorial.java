package introtojava;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int number = scanner.nextInt();
        int factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
	}

}
