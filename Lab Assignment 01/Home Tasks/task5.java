public class task5 {
    public static void main(String[] args) {
        double a = 4.5;
        double b = 9.5;
        double c = Math.sqrt((a * a) + (b * b));
        double sina = a / c;
        double cosa = b / c;
        double sinb = b / c;
        double cosb = a / c;
        System.out.println("Sin(A): " + sina);
        System.out.println("Cos(A): " + cosa);
        System.out.println("Sin(B): " + sinb);
        System.out.println("Cos(B): " + cosb);
    }
}
