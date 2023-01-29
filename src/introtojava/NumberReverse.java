package introtojava;
import java.util.Scanner;
public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse = 0;
		int remainder;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a Number: ");
		int number = scanner.nextInt();
		while(number != 0){
		    remainder = number % 10;
		    reverse = (reverse * 10) + remainder;
		    number = number/10;
		}

		System.out.println(reverse);

	}
}
