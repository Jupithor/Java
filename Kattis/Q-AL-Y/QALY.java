//https://open.kattis.com/problems/qaly
import java.util.Scanner;

public class QALY{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double x = 0.0;
        double y = 0.0;
        double answer = 0.0;
        
        while(sc.hasNext()){
            x = Double.parseDouble(sc.next());
            y = x*Double.parseDouble(sc.next());
            answer += y;
        }
        System.out.println(answer);
        sc.close();
    }
}