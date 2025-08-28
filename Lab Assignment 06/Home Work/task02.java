import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            int a = s1.charAt(i);
            boolean flag = true;
            for (int j = 0; j < s2.length(); j++) {
                int b = s2.charAt(j);
                if (a == b) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                result += (char) a;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            int a = s2.charAt(i);
            boolean flag = true;
            for (int j = 0; j < s1.length(); j++) {
                int b = s1.charAt(j);
                if (a == b) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                result += (char) a;
            }
        }
        System.out.println(result.toUpperCase());
    }
}
