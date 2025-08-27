import java.util.Scanner;
public class task4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of array 1:");
        int l1 = sc.nextInt();
        System.out.println("Please enter the elements of the arr1:");
        int[] arr1 = new int [l1];
        for(int i = 0; i < l1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Please enter the length of array 2: ");
        int l2 = sc.nextInt();
        System.out.println();
        int [] arr2 = new int [l2];
        boolean flag = false;
        System.out.println("Please enter the elements of the arr2: ");
        for(int i = 0; i < l2; i++){
            arr2[i] = sc.nextInt();
        }
        for(int i = 0; i < l2; i++){
            flag = false;
            for(int j = 0; j < l1 ; j++){
                if(arr2[i] == arr1[j]){
                    flag =true;
                    break;
                }
            }
            if(flag == false){
                break;
            }
        }
        if(flag == false){
            System.out.println("Array 2 is not a subset of Array 1.");
        }
        else{
            System.err.println("Array 2 is a subset of Array 1.");
        }
        sc.close();
    }
}
