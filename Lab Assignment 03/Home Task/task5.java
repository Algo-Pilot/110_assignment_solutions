//task5
import java.util.Scanner;
public class hw_task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Number: ");
            sum = sum + sc.nextInt();
            System.out.println("Sum = " + sum);
        }
        sc.close();
    }
}