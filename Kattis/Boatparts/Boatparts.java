//https://open.kattis.com/problems/boatparts
import java.util.ArrayList;
import java.util.Scanner;

public class Boatparts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //number of parts to be replaced
        int iParts = sc.nextInt();
        //number of days in the season (skiped)
        sc.nextInt();
        int iDay = 0;
        ArrayList<String> parts = new ArrayList<String>();
        ArrayList<String> uniqueParts = new ArrayList<String>();

        while (sc.hasNext()) {
            parts.add(sc.next());
        }

        for (String part : parts) {
            iDay++;
            if(!uniqueParts.contains(part)){
                uniqueParts.add(part);
                if(uniqueParts.size() == iParts){
                    break;
                }
            }
            
        }

        if(uniqueParts.size()==iParts){
            System.out.println(iDay);
        }else{
            System.out.println("paradox avoided");
        }
        sc.close();
    }
}
