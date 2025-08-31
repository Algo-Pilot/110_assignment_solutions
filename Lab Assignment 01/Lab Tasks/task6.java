public class task6 {
    public static void main(String[] args){
        //a. by creating a third variable
        int a = 5;
        int b = 6;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b. without creating any variable;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
