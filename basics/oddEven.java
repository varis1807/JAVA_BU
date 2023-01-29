package basics;
import java.util.Scanner;

public class oddEven{

    public static void oddeven(int num){
        if(num%2==0){
            System.out.println("num is even");
        }
        else{
            System.out.println("num is odd");
        }
    }
    public static void main(String[] agrs){
        Scanner scn = new Scanner(System.in);
        //inp fior int
        int n = scn.nextInt();
        // //int for string
        // String s = scn.next();
        for(int i = 0; i<n; i++){
            int num = scn.nextInt();
            oddeven(num);
        }
    }
}