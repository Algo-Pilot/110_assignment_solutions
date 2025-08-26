import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are");
        for (int i = 0; i < num; i++) {
            System.out.printf("%d: %d%n", i, arr[i]);
        }
        System.out.println("After resizing the array: ");
        for (int i = 0; i < num; i++) {
            if (i == num - 1) {
                System.out.println(arr[i]);
            }
            else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
