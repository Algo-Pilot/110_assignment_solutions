public class task03 {
    public static void main(String [] args){
        boolean res = isTriangle(3,2,1);
        System.out.println( res );
        triArea(7,5,10);
    }
    public static boolean isTriangle(int a, int b, int c){
        if(a + b > c && b + c > a && a + c > b){
            return true;
        }
        else{
            return false;
        }
    }
    public static void triArea(int a, int b, int c){
        if(isTriangle(a, b, c)){
            int s = a + b + c;
            s = s / 2;
            System.out.println(s);
            System.out.printf("%.3f%n",Math.sqrt(s * (s - a) * (s - b) *(s - c)));
        }
        else{
            System.out.println("Can\'t form triangle");
        }
        
    }
}
