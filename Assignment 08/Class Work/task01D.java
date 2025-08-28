public class task01D {
    public static void main(String [] args){
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
}
