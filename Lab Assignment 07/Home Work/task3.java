import java.util.Scanner;
public class task3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int num = sc.nextInt();
        double [] arr = new double [num];
        for(int i = 0; i< num; i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextDouble();
        }
        double max =  arr[0];
        int mi = 0;
        double min = arr[0];
        int mini = 0;
        double sum = arr[0];
        for(int i = 1; i < num; i++){
            if(arr[i] > max){
                max = arr[i];
                mi = i;
            }
            else if(arr[i] < min){
                min = arr[i];
                mini = i;
            }
            sum += arr[i];
        }
        System.out.printf("Maximum element %.1f found at index %d%n", max, mi);
        System.out.printf("Minimum element %.1f found at index %d%n", min, mini);
        System.out.printf("Summation: %.1f%nAverage: %.2f%n", sum, sum / num);
        sc.close();
    }
}
