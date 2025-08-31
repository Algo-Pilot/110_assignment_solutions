import java.util.Scanner;
public class task5{
  public static void main (String [] args){
    Scanner sc =  new Scanner(System.in);
    int x = sc.nextInt();
    if (x < 0){
      x = x*2;
      System.out.println("output: "+ x);
    }
    else if (x >+ 0 && x < 2){
      x = x + 1;
      System.out.println("output: "+ x);
    }
     else if (x >= 2 && x < 5){
      x = (x*x) - 1;
      System.out.println("output: "+ x);
    }
      else if (x >= 5){
      x =(3*x*x) + 2;
      System.out.println("output: "+ x);
      }
  }
}
