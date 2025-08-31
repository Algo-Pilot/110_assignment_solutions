public class task3 {
    public static void main(String[] args) {
        int student_id = 23221454;
        int last = student_id % 10;
        int bfr_last = (student_id / 10) % 10;
        System.out.print(last);
        System.out.print(bfr_last);
        System.out.println();
    }
}
