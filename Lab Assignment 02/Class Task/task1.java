import java.util.Scanner;
public class task1{
  public static void main (String [] args){
    Scanner sc =  new Scanner(System.in);
    int largestnum = Integer.MIN_VALUE;
    for(int i = 0; i < 3; i++){
      int a = sc.nextInt();
      if(a > largestnum){
        largestnum = a;
      }
    }
    System.out.println("largest number: " + largestnum);
  }
}
