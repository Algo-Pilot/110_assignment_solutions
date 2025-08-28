public class task1B {
    public static void main(String [] args){
        boolean result = isEven(10);
        System.out.println( result );
    }
    public static boolean isEven(int num){
        if(num %2 ==0){
            return true;
        }
        else{
            return false;
        }
    }
}
