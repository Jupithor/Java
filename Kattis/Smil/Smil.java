//https://open.kattis.com/problems/smil

/**
 * Smil
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Smil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> smils = new HashSet<String>(){{
            add(":)");
            add(";)");
            add(":-)");
            add(";-)");
        }};
        String symbols = sc. nextLine();

        for(int i=0;i<symbols.length();i++){
            if(smils.contains(symbols.substring(i, i+Math.min(2, symbols.length()-i))) ||  
            smils.contains(symbols.substring(i, i+Math.min(3,symbols.length()-i)))){
                System.out.println(i);
            }
        }
        sc.close();
    }
}