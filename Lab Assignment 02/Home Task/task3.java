import java.util.Scanner;
public class htask3{
  public static void main(String [] args){
    Scanner sc =  new Scanner(System.in);
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    double z = sc.nextDouble();
    if (x > y && x > z){
      System.out.println("Maximum number is " + x);
      if (y>z){
        System.out.println("Minimum number is " + z);
      }
      else{
        System.out.println("Minimum number is " + y);
      }
    }
    else if (y>x && y> z){
      System.out.println("Maximum number is " + y);
      if (x>z){
        System.out.println("Minimum number is " + z);
      }
      else{
        System.out.println("Minimum number is " + x);
      }
    }
    else{
      System.out.println("Maximum number is " + z);
      if (x>y){
        System.out.println("Minimum number is " + y);
      }
      else{
        System.out.println("Minimum number is " + x);
      }
    }
  }
}
