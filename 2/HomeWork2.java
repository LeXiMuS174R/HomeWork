import java.util.Scanner;
import java.util.Arrays;

class HomeWork2 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sum numbers:");
        
        int n = scanner.nextInt();
        int array[] = new int[n];
        int arraySum = 0;

        for (int i =0; i < array.length; i++ ) {
            System.out.print("Enter the number: ");
            array[i] = scanner.nextInt();
        }

        for (int i =0; i < array.length; i++ ) {
            arraySum += array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println(arraySum);
    }
}