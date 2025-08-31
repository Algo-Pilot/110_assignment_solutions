import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int Start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();
        for (int i = Start; i <= end; i++) {
            boolean flag = true;
            if(i == 1){
                continue;
            }
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && (j != 1 && j != i)) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
