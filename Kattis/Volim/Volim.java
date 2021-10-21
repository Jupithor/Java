//https://open.kattis.com/problems/volim

/**
 * Volim
 */

import java.util.Scanner;

public class Volim {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      //k=(start) position of box, n=numbers of questions in the game, t=time passed, z=answer given
      int k = sc.nextInt();
      int n = sc.nextInt();
      //time before bomb goes off
      int time = 210;

      for(int i=0;i<n;i++){
        int t=sc.nextInt();
        time=time-t;
        if(time<0){
            System.out.println(k);
            break;
        }
        String z = sc.next();
        if(z.equals("T")){
            k = (k == 8) 
            ? 1 
            : k+1 ;
        }
      }
      sc.close();
    }
}