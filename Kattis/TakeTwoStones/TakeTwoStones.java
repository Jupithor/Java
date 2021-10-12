//https://open.kattis.com/problems/twostones/submit
import java.util.Scanner;
     
/**
 * TakeTwoStones
 */
public class TakeTwoStones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stones = sc.nextInt();

        if((stones%2)==0){
            System.out.println("Bob");
        }else{
            System.out.println("Alice");
        }
        sc.close();
    }
}
