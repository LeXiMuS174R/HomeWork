import java.util.Scanner;
import java.util.Arrays;

class HomeWork {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers do you need to add?");

		int asize = scanner.nextInt();
		int array[] = new int[asize];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Please, enter the number: ");
			array[i] = scanner.nextInt();

		}
		
		// for (int i = 0; i < array.length; i++) {
		// 	arraySum += array[i];
		// }

		System.out.println(Arrays.toString(array));
		System.out.println("Sum array elements = " + arraySum(array));
	}
	public static int arraySum(int a) {
		return arraySum += array[i];
	}
}