public class task4{
  public static void main(String [] args){
    int x = 600;
    int y= 0;
    for (int i = 0; i <= x ; i++){
      if (i %7 == 0 || i % 9 ==0){
        y += i;
      }
    }
    System.out.println(y);
  }
}
