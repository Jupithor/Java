//problem at https://open.kattis.com/problems/electricaloutlets

import java.util.Scanner;

public class ElectricalOutlets {

    public static void main(String[] args) {
        // read input
        Scanner sc = new Scanner(System.in);

        final int cases = sc.nextInt();

        for(int i =0; i < cases; i++){
            int powerstrips = sc.nextInt();
            int plugs = 1; //always start with 1 plug
            for( int j=0; j < powerstrips; j++){
                //remove one plug for the powerstrip
                plugs -= 1;
                //add the next powerstrip
                plugs += sc.nextInt();
            }
            System.out.println(plugs);
        }
        sc.close();
    }
}