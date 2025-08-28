import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int vc = 0, cc = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i);
            if (a == 65 || a == 69 || a == 73 || a == 79 || a == 85 || a == 97 || a == 101 || a == 105 || a == 111 || a == 117) {
                vc++;
            }
            else if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
                cc++;
            }
        }
        if (vc > 0 && cc > 0 && vc % 3 == 0 && cc % 5 == 0) {
            System.out.println("Aaar! Me Plunder!!");
        } else {
            System.out.println("Blimey! No Plunder!!");
        }
    }
}
