//https://open.kattis.com/problems/whatdoesthefoxsay

/**
 * WhatDoesTheFoxSay
 */

 import java.util.Scanner;
 import java.util.List;
 import java.util.ArrayList;

public class WhatDoesTheFoxSay {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //t=number of testcases
    int t = sc.nextInt();
    sc.nextLine();
    for(int i=0; i<t;i++){
        //r=the recording
        String r = sc.nextLine();
        //a list of animals and their sounds
        String a = sc.nextLine();
        //a list of the sound that each animal makes 
        List<String> sounds = new ArrayList<String>();
        while(!a.equals("what does the fox say?")){
           sounds.add(a.substring(a.lastIndexOf(" ")+1)); 
           a = sc.nextLine();
        }
        for(int j=0;j<sounds.size();j++){
        r=r.replaceAll("\\b"+sounds.get(j)+"\\b", "");
        }
        System.out.println(r);
    }
    sc.close();
    }
}