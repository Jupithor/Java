//https://open.kattis.com/problems/rot

import java.util.Scanner;

public class ReverseRot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alphabet = new char[] {
            'a','b','c','d','e','f','g','h','i',
            'j','k','l','m','n','o','p','q','r',
            's','t','u','v','w','x','y','z','_','.'
         };
        int rotate;
        while(sc.hasNextLine()){
            StringBuilder Kode= new StringBuilder();
            StringBuilder newKode= new StringBuilder();
            rotate=sc.nextInt(); 
            if(rotate ==0){
                System.exit(0);
            }
            Kode.append(sc.nextLine().strip());
            Kode.reverse();
            for(int i= 0; i<Kode.length(); i++){
                
                int pos = new String(alphabet).toUpperCase().indexOf(Kode.charAt(i));
                newKode.append(alphabet[(pos+rotate)%28]);
            }
           
            
            System.out.println(newKode.toString().toUpperCase());   
            
        }
        sc.close();
    }
}