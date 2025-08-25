import java.util.Scanner;
public class task5{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int num = sc.nextInt();
        int [] arr = new int[num];
        for(int i =0; i < num;  i++){
            System.out.print("Enter a number: ");
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
            int val = arr[i];
            int  index = i;
            for(int j = i +1 ; j < num; j++){
                if(val < arr[j]){
                    val = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println("Sorted Array: ");
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