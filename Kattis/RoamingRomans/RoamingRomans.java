//https://open.kattis.com/problems/romans

public class RoamingRomans{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double convertions = 1000*(5280.0/4854.0);
        double input = sc.nextDouble();
    
        Long answer = Math.round(input * convertions);
        
        System.out.println(answer);
        sc.close();
    }
    
}
