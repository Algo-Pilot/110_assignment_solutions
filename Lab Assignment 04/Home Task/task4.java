import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Customer: ");
        int num = sc.nextInt();
        for(int i = 1; i <=num; i++){
            System.out.print("Item Number for Customer-1: ");
            int item = sc.nextInt();
            int sum = 0;
            double avg;
            for(int j = 1; j<= item; j++){
                System.out.printf("Item-%d: ", j);
                int a = sc.nextInt();
                sum = sum + a;
            }
            avg = sum / (double)item;
            System.out.printf("Average for Customer-%d: %.1f%n",i, avg);
        }
        sc.close();
    }
}
