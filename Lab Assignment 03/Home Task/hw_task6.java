//task 6
import java.util.Scanner;
public class hw_task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 0;
        System.out.println("Divisors of " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("Total Divisors: " + counter);
        sc.close();
    }
}