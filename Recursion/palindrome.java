package Recursion;

import java.util.*;
class palindromerecursive {

public static boolean ispalindrome(String str,int start,int end){
    if(start>=end){
        return true;

    }
    if(str.charAt(start)!=str.charAt(end)){
return false;

    }
    else{
        return ispalindrome(str,start+1,end-1);
    }
}






    public static void main(String [] args){
        Scanner p=new Scanner(System.in);
        String str=p.nextLine();
        if(ispalindrome(str ,0,str.length()-1)){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

}