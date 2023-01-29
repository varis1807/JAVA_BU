import java.util.*;

public class function {
    public static void main(String[] args) {
        //array declaration
        Scanner sonali = new Scanner(System.in);
        int size = sonali.nextInt();
        int[] arr= new int[size];
        // arr[0]=1;
        // arr[1]=2;
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);

        for(int i=0; i<size; i++){
            arr[i] = sonali.nextInt();
        }

        for(int ele: arr){
            System.out.println(ele);
        }
    }
}
