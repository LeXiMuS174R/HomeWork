import java.util.Scanner;
import java.util.Arrays;

class HomeWork4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers do you need to add?");

		int asize = scanner.nextInt();
		int array[] = new int[asize];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Please, enter the number: ");
			array[i] = scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
	}
}