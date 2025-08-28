public class task01 {
    public static void main(String [] args){
        evenChecker(11);
        boolean result = isEven(10);
        System.out.println( result );
        result = isPos(-5);
        System.out.println( result );
        sequence(-10);
    }
    public static void sequence(int num){
        if(isPos(num)){
            for(int i = 0; i <= num; i+= 2){
                if(i == 0){
                    System.out.print(i+ " ");
                }
                else if(i == num || i == num -1){
                    System.out.println(i);
                }
                else{
                    System.out.print(i+" ");
                }
            }
        }
        else{
            if(isEven(num)){
                num++;
            }
            for(int i = num; i <=-1;i+=2){
                if(i == -1){
                    System.out.println(i);
                }
                else{
                    System.out.print(i + " ");
                }
            }
        }
    }
    public static boolean isPos(int num){
        if(num>0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isEven(int num){
        if(num %2 ==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void evenChecker(int num){
        if(num %2 ==0){
            System.out.println("Even!!");
        }
        else{
            System.out.println("Odd!!");
        }
    }
}
