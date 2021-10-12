//https://open.kattis.com/problems/tarifa
import java.util.Scanner;

public class Tarifa {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int data = sc.nextInt();
    int monts = sc.nextInt();
    int output = data;
    for (int i=0; i < monts;i++){
        output+=data-sc.nextInt();
    }
    System.out.println(output);
    sc.close();
   } 
}
