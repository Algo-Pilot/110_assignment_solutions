import java.util.Scanner;
public class htask6{
  public static void main (String [] args){
    Scanner sc =  new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a == b  && b == c){
      System.out.println("All numbers are equal");
    }
    else if (a != b && b != c){
      System.out.println("All numbers are different");
    }
    else{
      System.out.println("Neither all are equal or different");
    }
  }
}
