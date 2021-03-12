//https://open.kattis.com/problems/princesspeach
import java.util.Scanner;

import java.util.HashSet;

public class SavingPrincessPeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        int i = 0;
        HashSet<Integer> mario = new HashSet<Integer>();

        while (i < y) {
            mario.add(sc.nextInt());
            i++;
        }
        for (int k = 0; k < n; k++) {
            if (!mario.contains(k)) {
                System.out.println(k);
            }
        }

        System.out.println("Mario got " + mario.size()+ " of the dangerous obstacles.");
        sc.close();
    }
}
