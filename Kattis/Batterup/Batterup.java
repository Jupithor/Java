//https://open.kattis.com/problems/batterup

import java.util.Scanner;

public class Batterup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hit = scan.nextInt();
        double valid = 0;
        double bases = 0;

        while (hit --> 0){
            int score = scan.nextInt();
            if (score !=-1){
                valid += 1;
                bases += score;   
            }
        }
         
        
         System.out.println(bases/valid);
         scan.close();
    } 
}
