import java.util.Scanner;

class Program3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter the next numbers - 119, 33542, 99, 991, 0");

		int currentNumber = 0;
		int count = 5;
		int sumOfDigit = 0;
		int j = 0;
		int multinum = 1;

		while (j < count) {
			currentNumber = scanner.nextInt();			
			for (; currentNumber > 0; currentNumber /= 10) {
				sumOfDigit += currentNumber % 10;
			}
			System.out.println("Sum of Digits = " + sumOfDigit);

			boolean isPrime = true;
			for (int i = 2; i < sumOfDigit / 2; i++ ) {
				if (sumOfDigit % i == 0) { 
					isPrime = false;
					break;
				}
			}
			System.out.println("PrimeNumber? - " + isPrime);
			System.out.println("multinum = " + multinum);

			if (isPrime) {
				multinum *= currentNumber;
				System.out.println("multinum = " + multinum);
			}

			//Приводим сумму цифр к нулю, чтобы не накапливалась сумма
			if (sumOfDigit >= 0) {
				sumOfDigit = 0;
			}
			j++;
		}
			System.out.println("multinum = " + multinum);

		
	}
}