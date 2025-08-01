import java.util.Scanner;
public class htask2{
  public static void main(String [] args){
    Scanner sc =  new Scanner(System.in);
    int payment = sc.nextInt();
    int age = sc.nextInt();
    if ( age >= 18){
      if (payment < 10000){
        System.out.println("Your tax amounts in 0 Tk");
      }
      else if (payment >=10000 && payment <= 20000){
        int tax = (int) Math.round(payment * 0.05);
        System.out.println("Your tax amounts in " + tax+" Tk");
      }
      else if (payment > 20000){
        int tax = (int) Math.round(payment * 0.1);
        System.out.println("Your tax amounts in " + tax+" Tk");
      }
    }
    else{
      System.out.println("Your tax amounts in 0 Tk");
    }
  }
}
