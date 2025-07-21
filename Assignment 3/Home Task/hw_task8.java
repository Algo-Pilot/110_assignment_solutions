//task 8
import java.util.Scanner;
public class hw_task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copy = num;
        int counter = 0;
        int value = 1;
        int digit;
        for (int i = 0; num > 0; i++) {
            num = num / 10;
            counter++;
        }
        for (int i = 0; counter - 1 > i; i++) {
            value = value * 10;
        }
        for (int i = 0; i < counter; i++) {
            digit = copy / value;
            copy = copy % value;
            value = value / 10;
            if (i < counter - 1) {
                System.out.print(digit + ", ");
            }
            else {
                System.out.printf("%d%n",digit);
            }
        }
        sc.close();
    }
}