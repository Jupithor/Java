//https://open.kattis.com/problems/oddmanout

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddManOut{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cases = sc.nextInt();
        
        for (int i = 1; i<=cases; i++){
            int guestsC = sc.nextInt();
            List<Long> guests = new ArrayList<Long>();
            for(int j = 0; j<guestsC; j++){
                long guestNo = sc.nextInt();
                if(guests.contains(guestNo)){
                    guests.remove(guests.indexOf(guestNo));
                }else{
                    guests.add(guestNo);
                }
            }
            System.out.println("Case #"+i+": "+ guests.get(0));
        }

        sc.close();
    }
}
