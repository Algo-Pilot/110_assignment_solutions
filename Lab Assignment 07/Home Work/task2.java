import java.util.Scanner;
public class task2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int num = sc.nextInt();
        int [] arr = new int [num + 1];
        for(int i= 0; i < num; i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        int index = 0;
        int x = sc.nextInt();
        for(int i = 0; i < num; i++){
            if(x == arr[i]){
                flag = true;
                index = i;
                break;
            }
        }
        if(flag == true){
            System.out.printf("%d is at index %d%n", x , index);
        }
        sc.close();
    }
}
