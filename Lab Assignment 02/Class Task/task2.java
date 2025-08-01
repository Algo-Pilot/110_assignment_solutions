import java.util.Scanner;
public class task2 {
  public static void main (String [] args){
    Scanner sc =  new Scanner(System.in);
    int score = sc.nextInt();      // Given Score
    if (score > 100){
      System.out.println("Invalid number");
    }
    else if (score <= 100 && score >= 90){
        System.out.println("Your grade is A");
    }
    else if (score <= 89 && score >= 85){
        System.out.println("Your grade is A-");
    }
    else if (score <= 84 && score >= 70){
        System.out.println("Your grade is B");
    }
    else if (score <= 69 && score >= 57){
        System.out.println("Your grade is C");
    }
    else if (score <= 56 && score >= 50){
        System.out.println("Your grade is D");
    }
    else {
        System.out.println("Your grade is F");
    }
  }
}
