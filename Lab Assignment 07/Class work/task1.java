import java.util.Scanner;
public class task01 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int num = sc.nextInt();
        int [] arr = new int [num + 1];
        for(int i= 0; i < num; i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter another number: ");
        arr[num] = sc.nextInt();
        System.out.println("The elements of the array are:");
        for(int i = 0; i < num ; i++){
            System.out.printf("%d: %d%n",i, arr[i]);
        }
        System.out.println("After resizing the array:");
        for(int i = 0; i <= num ; i++){
            if(i == num ){
                System.out.println(arr[i]);
            }
            else{
                System.out.printf("%d ", arr[i]);
            }
        }
        sc.close();
    }
}
