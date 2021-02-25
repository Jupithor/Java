//https://open.kattis.com/problems/securedoors
import java.util.Scanner;
import java.util.HashMap;

public class SecureDoors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entries = sc.nextInt();
        var protocol = new HashMap<String, String>();
        String newStatus;
        String name;

        for (int i = 0; i < entries; i++) {
            newStatus = new String(sc.next());
            name = new String(sc.next());
            
            if (newStatus.equals("entry") ){
                newStatus = "entered";
            }else{
                newStatus = "exited";
            }
            if ((!protocol.containsKey(name) && newStatus.equals("exited")) || (protocol.containsKey(name) && protocol.get(name).equals(newStatus))) {
                System.out.println(name+" "+newStatus+" (ANOMALY)");
            }else{
                System.out.println(name+" "+newStatus);
            }
            protocol.put(name,newStatus);
        }
        sc.close();
    }
}
