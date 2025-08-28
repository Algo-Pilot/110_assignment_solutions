public class task01C {
    public static void main(String [] args){
        boolean result = isPos(-5);
        System.out.println( result );
    }
    public static boolean isPos(int num){
        if(num>0){
            return true;
        }
        else{
            return false;
        }
    }
}
