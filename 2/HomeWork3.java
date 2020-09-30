import java.util.Scanner;
import java.util.Arrays;

class HomeWork3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers do you need to add?");

		int asize = scanner.nextInt();
		int array[] = new int[asize];
		int arraySum = 0;
		int arrayAverage = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.print("Please, enter the number: ");
			array[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			arraySum += array[i];
		}

		arrayAverage = arraySum / array.length;

		System.out.println(Arrays.toString(array));
		//Знак "~" используется потому, что выдаёт только целые числа, если будет среднее "805,5", выдаст "805"
		System.out.println("Average an array ~ " + arrayAverage);
	}
}