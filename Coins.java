/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int  a = Integer.parseInt(args[0]);
		 System.out.println("Use " +a/25 + " quarters and " + a%25 + " cents"); //print amount in cents
	}
}