import java.util.Scanner;

//https://open.kattis.com/problems/trik

/**
 * Trik
 */
import java.util.Scanner;

public class Trik {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int cup = 1;
       String moves = sc.nextLine();

       for (char c: moves.toCharArray()){
           if (c=='A' && cup != 3){
               cup = 3 - cup;
           }
           if (c=='B' && cup != 1){
               cup = 5 - cup; 
           }
           if (c=='C' && cup != 2){
               cup = 4 - cup;
           }
       }
       System.out.println(cup);
       sc.close();
   } 
}