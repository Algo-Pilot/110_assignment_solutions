import java.util.Scanner;
public class task1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int num = sc.nextInt();
        int [] arr = new int[num];
        for(int i =0; i < num;  i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Original Array: ");
        for(int i = 0; i < num ; i++){
            if(i == num - 1){
                System.out.println(arr[i]);
            }
            else{
                System.out.printf("%d ", arr[i]);
            }
        }
         for(int i = 0; i < num; i ++){
            if(arr[i] > 0){
                arr[i] = 1;
            }
            else if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        System.out.println("After modifying: ");
        for(int i = 0; i < num ; i++){
            if(i == num - 1){
                System.out.println(arr[i]);
            }
            else{
                System.out.printf("%d ", arr[i]);
            }
        }
        sc.close();
    }
}
