//https://open.kattis.com/problems/simon

import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        sc.nextLine();
        for(int j =0;j<i;j++) {
           String line = sc.nextLine();
            if (line.startsWith("simon says ")) {
                String out =line.replace("simon says ","");
                System.out.println(out);
            }
            else{
                System.out.println();
            }
    }
        sc.close();
    }
}