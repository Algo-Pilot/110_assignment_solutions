import java.util.Scanner;
public class task1{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i = 0; i< n; i++){
            int x =sc.nextInt();
            int y = sc.nextInt();
            int sum = 0;
            int count  = 1;
            for(int j = x; count <= y; j++){
                if(j % 2 != 0){
                    sum += j;
                    count++;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}