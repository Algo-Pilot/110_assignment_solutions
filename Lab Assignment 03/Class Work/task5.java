import java.util.Scanner;
public class task5{
  public static void main(String [] args){
    Scanner sc  = new Scanner(System.in);
    for (;;){
      System.out.print("Enter Number: ");
      int num = sc.nextInt();
      System.out.println();
      if (num >0){
        int a = num * num;
        System.out.println(num + " ^ " + num + " = " + a);
      }
      else{
        break;
      }
    }
  }
}
