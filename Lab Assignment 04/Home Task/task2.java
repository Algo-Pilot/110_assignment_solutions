import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        x.close();
    }
}
