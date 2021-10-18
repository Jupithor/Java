//https://open.kattis.com/problems/easiest

import java.util.Scanner;

public class TheEasistProblemIsThisOne{

    public static int findsum(int n) {
        if(n==0){
            return 0;
        }else{
            return n%10+findsum(n/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(); 
        
        while(n!=0){
            int sum=findsum(n);
            int msum=0;
            int i=10;
            while(sum!=msum){
                i+=1;
                msum=findsum(n*i);
            }     
            
            System.out.println(i);
            
       n = sc.nextInt();
       }
       
     sc.close();  
    }
}