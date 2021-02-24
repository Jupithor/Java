//https://open.kattis.com/problems/bijele

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Bijele{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> chess = new ArrayList<Integer>(Arrays.asList(1,1,2,2,2,8));
        String space="";
        for(int i =0; i<6;i++){
            int j = sc.nextInt();
                System.out.print(space);
                System.out.print(chess.get(i)-j);
                space=" ";
        }

        sc.close();
    }
}
