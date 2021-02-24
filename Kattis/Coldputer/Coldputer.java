//https://open.kattis.com/problems/cold

import java.util.Scanner;

public class Coldputer {

    public static void main(String[] args) {
        int days;
        int belowZero=0;
        Scanner sc = new Scanner(System.in);

        days = sc.nextInt();

        for (int i=0; i<days;i++){
            if (sc.nextInt()<0){
                belowZero += 1;
            }
        }
        System.out.println(belowZero);
        sc.close();


    }

}

