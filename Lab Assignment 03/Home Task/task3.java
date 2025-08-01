//task3
import java.util.Scanner;
public class hw_task3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int pos = 0, neg = 0;
        for(int i = 1; i <= num; i++){
            System.out.printf("Enter number %d: ", i);
            int a = sc.nextInt();
            if(a >= 0){
                pos++;
            }
            else{
                neg++;
            }
        }
        System.out.printf("%d Non-negative Numbers%n", pos);
        System.out.printf("%d Negative Numbers%n", neg);
        sc.close();
    }
}