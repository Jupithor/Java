//https://open.kattis.com/problems/spavanac
import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int min = sc.nextInt();

        min -= 45;

        if (min < 0) {
            hours -= 1;
            min += 60;
        }
        if (hours < 0) {
            hours = 23;
        }

        System.out.println(hours + " " + min);
        sc.close();

    }
}