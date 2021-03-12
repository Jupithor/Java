//https://open.kattis.com/problems/savingforretirement

import java.util.Scanner;

public class SavingForRetirement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageB = sc.nextInt();
        int retB = sc.nextInt();
        int savB = sc.nextInt();
        int ageA = sc.nextInt();
        int savA = sc.nextInt();
        int retA = 0;
        sc.close();
        int amountB = (retB - ageB) * savB;

        while (amountB >= retA) {
            retA += savA;
            ageA++;
        }
        System.out.print(ageA);
    }
}
