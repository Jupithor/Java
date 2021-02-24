//https://open.kattis.com/problems/oddgnome

import java.util.Scanner;
import java.util.ArrayList;

public class OddGnome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int gnomes = sc.nextInt();
            ArrayList<Integer> gnomesArrangement = new ArrayList<Integer>();
            for (int k = 0; k < gnomes; k++) {
                gnomesArrangement.add(sc.nextInt());
            }
            for (int j = 0; j < gnomesArrangement.size() - 1; j++) {
                if (gnomesArrangement.get(j) + 1 != gnomesArrangement.get(j + 1)) {
                    System.out.println(j + 2);
                    break;
                }
            }

        }
        sc.close();
    }
}

