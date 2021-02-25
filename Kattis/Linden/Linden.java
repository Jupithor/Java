//https://open.kattis.com/problems/lindenmayorsystem

import java.util.HashMap;
import java.util.Scanner;

class Linden{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> rules = new HashMap<String,String>();
        int number = sc.nextInt();
        int level = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i< number; i++){
            String rule = sc.nextLine();
            rules.put(rule.substring(0, 1),rule.substring(5));
        }

        String start = sc.next();
        
        String end = findMayor(start,level,rules);
        System.out.println(end);
        sc.close();

    }
    public static String findMayor(String start, int level, HashMap<String,String> rules){
        if(level != 0){
            StringBuilder end = new StringBuilder();
            start.chars().forEach( c -> {
                end.append(rules.get(String.valueOf((char) c)));
            });
            start = findMayor(end.toString(), level-1, rules);
        }
        return start;
    }
}
