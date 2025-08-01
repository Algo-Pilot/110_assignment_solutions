import java.util.Scanner;
public class cw_task2{
    public static void main (String [] args){
        Scanner x = new Scanner (System.in);
        System.out.print("The value of N: ");
        int a = x.nextInt();
        int sum = 0; 
        for(int i = 1;i<=a ; i++){
            int s = 0;
            for(int j =1; j <=i;j++){
               s = s + j;
            }
            sum = sum - s;
        }
        System.out.println("The value of y: " + sum);
        x.close();
    }
}
