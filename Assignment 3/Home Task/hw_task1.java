//task 1
import java.util.Scanner;
public class hw_task1{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        for(int i = 0; i <= a; i++){
            if(i % 5 == 0 && i % 3 !=0){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
        sc.close();
    }
}