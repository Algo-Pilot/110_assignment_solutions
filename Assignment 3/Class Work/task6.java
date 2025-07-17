import java.util.Scanner;
public class task6{
  public static void main(String [] args){
    Scanner sc  = new Scanner(System.in);
    int num = sc.nextInt();
    int sum =0;
    for (int i = 1;i <= num; i++){
      if(i % 2 == 0){
        int a = i * i;
        sum = sum - a;
      }
      else{
        int a = i * i;
        sum = sum + a;
      }
    }
    System.out.println(sum);
  }
}
