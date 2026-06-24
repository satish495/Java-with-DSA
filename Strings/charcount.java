package Strings;

import java.util.Scanner;

public class charcount {
    public static void count(String input){
        if(input==null)
            return;
        int consonant=0;
        int vowels=0;
        int digits=0;
        int spaces=0;
        int specialchar=0;
        String str=input.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
        
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            vowels++;
        else if(ch==' ')
            spaces++;
        else if(ch>='0'&&ch<='9')
            digits++;
        else if(ch>='a'&&ch<='z')
            consonant++;
        else
            specialchar++;
    }    
    System.out.print("Vowels:"+vowels);
    System.out.println();
    System.out.print("consonants:"+consonant);
    System.out.println();
    System.out.print("Digits:"+digits);
    System.out.println();
    System.out.print("Spaces:"+spaces);
    System.out.println();
    System.out.println("Special Characters:"+specialchar);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         String string = s.nextLine();
         String output = compressString();
        

        count(string);
    }
}
