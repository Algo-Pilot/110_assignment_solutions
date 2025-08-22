import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int num = sc.nextInt();
        int [] arr = new int [num];
        for(int i = 0; i< num; i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        //A - by creating a new array
        int [] new_arr = new int[num];
        int index = num - 1;
        for(int i = 0; i < num; i++){
            new_arr[i] = arr[index];
            index--;
        }
        System.out.println("Reversed using a new array:");
        for(int i = 0; i < num ;i++){
            if(i == num - 1){
                System.out.println(new_arr[i]);
            }
            else{
                System.out.printf("%d ", new_arr[i]);
            }
        }
        //B - without creating a new array
        for(int i = 0; i< num / 2; i++){
            int temp = arr[i];
            arr[i] = arr[num - 1 - i];
            arr[num -1 - i] = temp;
            index--;
        }
        System.out.println("Reversed the original array:");
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
