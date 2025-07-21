//task 7
import java.util.Scanner;
public class hw_task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lastdigit;
        for (int i = 1; num > 0; i++) {
            lastdigit = num % 10;
            if (num > 10) {
                System.out.print(lastdigit + ", ");
            }
            else {
                System.out.printf("%d%n", lastdigit);
            }
            num = num / 10;
        }
        sc.close();
    }
}