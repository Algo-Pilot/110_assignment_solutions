import java.util.Scanner;
public class task4{
  public static void main (String [] args){
    Scanner sc =  new Scanner(System.in);
    int given_year = sc.nextInt();
    int x = given_year % 100;
    int y = given_year % 400;
    int z = given_year % 4;
    if (x == 0 && y == 0){
      System.out.println(given_year + " is a leap year");
    }
    else if (x != 0 && z == 0){
      System.out.println(given_year + " is a leap year");
    }
    else{
      System.out.println(given_year + " is not a leap year");
    }
  }
}
