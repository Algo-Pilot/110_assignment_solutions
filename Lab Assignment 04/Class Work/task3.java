import java.util.Scanner;
public class cw_task3{
    public static void main (String [] args){
        Scanner x = new Scanner (System.in);
        for(;;){
            int count = 0;
            System.out.print("Enter Number: ");
            int a = x.nextInt();
            if (a%2==0){
                for(int i = 1; i<=a;i++){
                    if (a % i ==0){
                        count++;
                    }
                }
                System.out.println(a + " has "+ count +" divisors");
            }
            else{
                break;
            }
        }
        x.close();
    }
}