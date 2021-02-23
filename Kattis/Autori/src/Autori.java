//https://open.kattis.com/problems/autori
import java.util.Scanner;

public class Autori{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String name = sc.next();
        StringBuilder newName = new StringBuilder();
        //first char
        newName.append(name.charAt(0));

        for(int i=0; i < name.length(); i++){
            if(name.charAt(i) == '-'){
                //append the char after "-"
                newName.append(name.charAt(i+1));
            }
        }

        System.out.println(newName.toString());
        sc.close();

    
        }
    }