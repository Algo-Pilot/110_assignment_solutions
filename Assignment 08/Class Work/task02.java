public class task02 {
    public static void main(String [] args){
        double area = circleArea(5);
        System.out.println(area);
        double volume = sphereVolume(5.0);
        System.out.println(volume);
        findSpace(10,"circle");
    }
    public static void findSpace(double num, String name){
        if(name.equals("circle")){
            num /= 2;
            System.out.println(circleArea(num));
        }
        else if(name.equals("sphere")){

            System.out.println(sphereVolume(num));
        }
        else{
            System.out.println("Wrong Parameter");
        }
    }
    public static double sphereVolume(double num){
        return 4 / 3.0 * Math.PI * num * num * num;
    }
    public static double circleArea(double num){
        return  Math.PI * num * num;
    }
}
