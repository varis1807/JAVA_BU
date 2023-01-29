package basics;
import java.util.*;

public class middleStr {
    
    public static void middChar(String str){
        int len = str.length();
        //System.out.println(len);
        // char ch = str.charAt(len/2);
        //System.out.println(ch);
        int idx = len/2;
        // char ch1 = str.charAt(idx);
        // char ch2 = str.charAt(idx-1);
        System.out.print(str.charAt(idx-1));
        System.out.print(str.charAt(idx));
    }
    public static void main(String[] args){

        String  str= "Varisr";//ri
        middChar(str);
    }
}
