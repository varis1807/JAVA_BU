import java.util.*;

public class basic {
    public static void printSubStr(String str){
        for(int i =0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }
    }

    public static boolean checkPalin(String str){
        int n =str.length();
        int si = 0, ei =n-1;
        boolean flag = true;
        while(si<=ei){
            char ch1 = str.charAt(si);
            char ch2 = str.charAt(ei);
            if(ch1 != ch2){
                return flag = false;
            }
            else{
                si++;
                ei--;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        String str = "abcde";
        //System.out.println(str);
        //1
        //System.out.println(str.charAt(2));
        //2
       // System.out.println(str.length());
        //3
        //System.out.println(str.substring(0,2));
        //4
        // str += 'f';
        // System.out.println(str);


        // operations-------------------------
        //1. SubString
        //abc
        //ANS-->  
        // a    b    c
        // ab   bc
        // abc
        //printSubStr("abc");


        //2. palindrome
        // abcdcba
        System.out.println(checkPalin("abcdcba"));
    }
}
