public class task1 {
    public static void main(String[] args){
        int mins = 3456789;
        int days =  mins / (24 * 60);
        int years = days / 365;
        days = days % 365;
        System.out.println(mins + " minutes is approximately " + years + " years and " + days + " days");

    }
}
