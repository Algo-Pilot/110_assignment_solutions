import java.util.Scanner;
public class task2{
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.println();
        System.out.println("Input the 5 numbers: ");
        int sum = 0;
        for(int i = 0 ; i < n; i++){
            sum = sum + sc.nextInt();
        }
        System.out.println("The sum of " + n +" no is: " + sum);
        double avj = sum / (double)n;
        System.out.println("The Average is: " + avj); 
        
    }
}
