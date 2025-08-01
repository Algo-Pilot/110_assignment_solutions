import java.util.Scanner;
public class cw_task1{
    public static void main (String [] args){
        Scanner x = new Scanner (System.in);
        int a = x.nextInt();
        int ct=0;
        for(int i = 1; ; i++){
            int count=0;
            for(int m = 1;m <= i; m++ ){
                if (i % m == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(i);
                ct++;
            }
            if (ct == a){
                break;
            }
        }
        x.close();
    }
}
