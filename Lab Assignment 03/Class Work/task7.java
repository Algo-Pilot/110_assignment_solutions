import java.util.Scanner;
public class task7{
  public static void main (String [] args){
    Scanner sc  = new Scanner(System.in);
    int num = sc.nextInt();
    int digitcount = 0;
    for (int i = 0; num > 0; i++){
      num = num /10;
      digitcount++;
    }
    System.out.println("Total digits = "+ digitcount);
  }
}
