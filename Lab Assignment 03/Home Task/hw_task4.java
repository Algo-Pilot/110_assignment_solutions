//task4
import java.util.Scanner;
public class hw_task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int num = sc.nextInt();
        int counter = 0;
        int sum = 0;
        System.out.println("The odd numbers are:");
        for (int i = 0; counter < num; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum = sum + i;
                counter++;
            }
        }
        System.out.println("The Sum of odd Natural Numbers up to " + num + " terms is: " + sum);
        sc.close();
    }
}