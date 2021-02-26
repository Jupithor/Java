//https://open.kattis.com/problems/nastyhacks
import java.util.Scanner;

public class Nastyhacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        int e = 0;
        int c = 0;

        for (int i = 0; i < n; i++) {
            r = sc.nextInt();
            e = sc.nextInt();
            c = sc.nextInt();
            if (r < (e - c)) {
                System.out.println("advertise");
            } else if (r == (e - c)) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }
        sc.close();
    }
}

