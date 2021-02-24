//https://open.kattis.com/problems/cetvrta

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Cetvrta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xCord = 0;
        int xCordSc = 0;
        int yCord = 0;
        int yCordSc = 0;
        ArrayList<Integer> xCords = new ArrayList<Integer>();
        ArrayList<Integer> yCords = new ArrayList<Integer>();

        while (sc.hasNextInt()) {
            xCords.add(sc.nextInt());
            yCords.add(sc.nextInt());
        }

        for (int i : xCords) {
            xCordSc = Collections.frequency(xCords, i);
            if (xCordSc == 1){
                xCord = i;
                break;
            }
        }
        for (int i : yCords) {
            yCordSc = Collections.frequency(yCords, i);
            if (yCordSc == 1){
                yCord = i;
                break;
            }
        }

        System.out.println(xCord + " " + yCord);
        sc.close();

    }
}