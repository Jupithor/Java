//https://open.kattis.com/problems/sevenwonders

import java.util.Scanner;
import java.lang.Math;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double t = 0;
        double g = 0;
        double c = 0;
        int result;

        while (sc.hasNext()) {
            String s = sc.next();
            for (int i = 0; i < s.length(); i++) {
                if (s.startsWith("T",i)) {
                    t++;
                } else if (s.startsWith("G",i)) {
                    g++;
                } else {
                    c++;
                }
            }
            result = (int)(Math.pow(t,2) + Math.pow(g,2) + Math.pow(c,2));

            while ((t >= 1) && (g >= 1) && (c >= 1)) {
                result += 7;
                t--;
                g--;
                c--;
            }
            System.out.println(result);
            

        }
        sc.close();
    }
}
