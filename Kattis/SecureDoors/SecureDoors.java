//https://open.kattis.com/problems/securedoors
import java.util.Scanner;
import java.util.HashMap;

public class SecureDoors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entries = sc.nextInt();
        boolean anomaly = false;
        var protocol = new HashMap<String, String>();
        String currentStatus;
        String newStatus;
        String name;

        for (int i = 0; i < entries; i++) {
            newStatus = new String(sc.next());
            name = new String(sc.next());
            
            if (protocol.containsKey(name)) {
                currentStatus = protocol.get(name);
                if (currentStatus.equals(newStatus)) {
                    anomaly = true;
                } else {
                    protocol.replace(name, currentStatus, newStatus);
                    anomaly = false;
                }
            } else {
                protocol.put(name, newStatus);
                if (newStatus.equals("exit")) {
                    anomaly = true;
                } else {
                    anomaly = false;
                }
            }

            if (protocol.get(name).equals("entry")) {
                if (anomaly == true) {
                    System.out.println(name + " entered (ANOMALY)");
                } else {
                    System.out.println(name + " entered");
                }
            } else {
                if (anomaly == true) {
                    System.out.println(name + " exited (ANOMALY)");
                } else {
                    System.out.println(name + " exited");
                }
            }
          anomaly = false;  
        }
        sc.close();
    }
}
