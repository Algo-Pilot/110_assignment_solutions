import java.util.Scanner;
public class task1{
  public static void main(String [] args){
    Scanner sc =  new Scanner(System.in);
    int num = sc.nextInt();
    int x = num % 5;
    int y = num % 7;
    if (x == 0 && y == 0) {
      System.out.println("Divisible by Both");
    }
    else if (x == 0 && y != 0 ){
       System.out.println("Invalid: Divisible by 5 Only");
    }
    else if (x != 0 && y == 0 ){
      System.out.println("Invalid: Divisible by 7 Only");
    }
    else {
      System.out.println("No");
    }
  }
}
