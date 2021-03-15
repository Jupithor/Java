//https://open.kattis.com/problems/speedlimit
import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int record = sc.nextInt();
            if (record != -1) {
                int hoursAccu = 0;
                int total = 0;
                int hours = 0;
                int speed = 0;
                for (int i = 0; i < record; i++) {
                    speed = sc.nextInt();
                    hoursAccu = hours;
                    hours = sc.nextInt();
                    total += speed * (hours- hoursAccu);
                }

                System.out.println(total+" miles");
            }
        }
        sc.close();
    }
}