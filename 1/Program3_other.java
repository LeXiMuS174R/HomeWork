import java.util.Scanner;

class Program3_other {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		boolean isEven = number % 2 == 0;
		if (isEven) {
			System.out.println("EVEN");
		} else {
			System.out.println("ODD");
		}


		
		/*
				int num1 = 119;
		int num2 = 33542;
		int num3 = 99;
		int num4 = 991;
		int num5 = 0;

		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		
		boolean issimple;
		int j = 2;

		//Сумма цифр первого числа
		for ( ; num1 > 0; num1 /= 10) {
			sum1 += num1 % 10;
		}
		System.out.println(" Sum 1 number = " + sum1);
		//Проверка на простое или не простое число
		while (sum1 > 2) {
			issimple = true;
			if ((sum1%j) == 0) {
				issimple = false;
				System.out.println(sum1 + " is not simple number");
			}
			if (issimple) {
				System.out.println(sum1 + " is simple number");
			}
			sum1 = -1;
		}

		//Сумма цифр второго числа
		for ( ; num2 > 0; num2 /= 10) {
			sum2 += num2 % 10;
		}
		System.out.println(" Sum 2 number = " + sum2);
		while (sum2 > 2) {
			issimple = true;
			if ((sum2%j) == 0) {
				issimple = false;
				System.out.println(sum2 + " is not simple number");
			}
			if (issimple) {
				System.out.println(sum2 + " is simple number");
			}
			sum2 = -1;
		}

		//Сумма цифр третьего числа
		for ( ; num3 > 0; num3 /= 10) {
			sum3 += num3 % 10;
		}
		System.out.println(" Sum 3 number = " + sum3);
		while (sum3 > 2) {
			issimple = true;
			if ((sum3%j) == 0) {
				issimple = false;
				System.out.println(sum3 + " is not simple number");
			}
			if (issimple) {
				System.out.println(sum3 + " is simple number");
			}
			sum3 = -1;
		}

		//Сумма цифр четвертого числа
		for ( ; num4 > 0; num4 /= 10) {
			sum4 += num4 % 10;
		}
		System.out.println(" Sum 4 number = " + sum4);
		while (sum4 > 2) {
			issimple = true;
			if ((sum4%j) == 0) {
				issimple = false;
				System.out.println(sum4 + " is not simple number");
			}
			if (issimple) {
				System.out.println(sum4 + " is simple number");
			}
			sum4 = -1;
		}

		//Сумма цифр пятого числа
		for ( ; num5 > 0; num5 /= 10) {
			sum5 += num5 % 10;
		}
		System.out.println(" Sum 5 number = " + sum5);
		while (sum5 > 2) {
			issimple = true;
			if ((sum5%j) == 0) {
				issimple = false;
				System.out.println(sum5 + " is not simple number");
			}
			if (issimple) {
				System.out.println(sum5 + " is simple number");
			}
			sum5 = -1;
		}
		
		for (x = 0; x < 5; x++) {

		}
		*/
	}
}