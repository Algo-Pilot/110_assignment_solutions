// public class task1{
//   public static void main(String [] args){
//     for (int i = 24; i >= -6 ; i -= 6){
//       if (i == -6){
//         System.out.print(i);
//       }
//       else{
//         System.out.print(i+", ");
//       }
//     }
//   }
// }

public class task1{
  public static void main(String [] args){
    int x = 18;
    int y =63;
    for (int i = x; i <= y; i += 9){
      if (i % 2==0){
        System.out.print(i);
        }
      else if (i % 2 != 0){
        System.out.print(i*-1);
      }
      if(i+9 <= y ){
        System.out.print(", ");
      }
      
    }
  }
}


