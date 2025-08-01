import java.util.Scanner;
public class htask5{
  public static void main(String [] args){
    Scanner sc =  new Scanner(System.in);
    int need_to_pay = sc.nextInt();
    int customer_gave = sc.nextInt();
    if (customer_gave >= need_to_pay){
      int need_to_return = customer_gave - need_to_pay;
      if (need_to_return > 0){
        System.out.println("The returned amount is "+ need_to_return +" taka");
        int hundred = need_to_return / 100;
        int after_hundred = need_to_return - (100 * hundred);
        int fifty = after_hundred / 50;
        int after_fifty = after_hundred - (50 * fifty);
        int tweenty = after_fifty / 20;
        int after_tweenty = after_fifty - (20 * tweenty);
        int ten = after_tweenty / 10;
        int after_ten = after_tweenty - (10 * ten);
        int five = after_ten / 5;
        int after_five = after_ten - (5 * five);
        int two = after_five / 2;
        int after_two = after_five - (2 * two);
        int one = after_two / 1;
        System.out.println("100 taka note: " + hundred );
        System.out.println("50 taka note: " + fifty );
        System.out.println("20 taka note: " + tweenty );
        System.out.println("10 taka note: " + ten );
        System.out.println("5 taka coin: " + five );
        System.out.println("2 taka coin: " + two );
        System.out.println("1 taka coin: " + one );
      }
      else{
        System.out.println("The returned amount is "+ need_to_return +" taka");
      }
    }
    else{
      int more_pay = need_to_pay - customer_gave;
      System.out.println("Please pay "+ more_pay +" taka more");
    }
  }
}
