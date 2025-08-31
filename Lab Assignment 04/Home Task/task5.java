import java.util.Scanner;
public class task5{
    public static void main (String [] args){
        Scanner x = new Scanner (System.in);
        System.out.print("Start: ");
        int a = x.nextInt();
        System.out.print("End: ");
        int b = x.nextInt();
        System.out.println("Armstrong numbers: ");
        for(int i = a ; i <= b ; i++){
            int sum =0;
            int copy = i; 
            int length = String.valueOf(i).length();
            int num;
            for(int j = 1 ; j <= length ; j++){
                num = copy % 10;
                int plus = (int) Math.pow(num, length);
                sum = sum + plus;
                copy = copy /10;
                // System.out.println(sum);
            }
            if (sum == i){
                System.out.println(i);
            }
        }
        x.close();
    }
}