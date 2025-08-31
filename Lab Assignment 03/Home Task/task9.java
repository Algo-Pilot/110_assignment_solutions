//task9
import java.util.Scanner;
public class hw_task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        boolean flag = true;
        if (num > 1) {
            for (int i = 1; i <= 10; i++) {
                int x = num % i;
                if (x == 0) {
                    if (i != 1 && i != 7) {
                        flag = false;
                    }
                }
            }
        }
        else{
            flag = false;
        }
        if (flag == true) {
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number");
        }
        else {
            System.out.println(num + " is not a perfect number");
        }
        sc.close();
    }
}