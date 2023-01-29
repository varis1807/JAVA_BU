import java.util.*;

public class basicImplementaions {
    // fxns return type
    // 1. void
    // 2. int
    // 3. boolean
    // 4. double ... any dt
    public static int max(int[] arr, int size) {
        // 5 8 6 1 9 2
        // ans = 9
        // brute force app.
        int maxEle = 0;
        for (int ele : arr) {
            // if(maxEle<ele)
            // maxEle = ele;
            maxEle = Math.min(ele, maxEle);
        }
        return maxEle;
    }

    public static int find(int[] arr, int size, int findEle) {
        // 5 8 6 1 9 2
        // 4
        int ansIdx = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == findEle)
                ansIdx = i;
        }
        return ansIdx;
    }

    public static int span(int[] arr, int n) {
        int maxEle = -(int) 1e9, minEle = (int) 1e9;
        for (int ele : arr) {
            maxEle = Math.max(maxEle, ele);
            minEle = Math.min(minEle, ele);
        }

        return Math.abs(minEle - maxEle);
    }

    public static void reverse(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + "<-");
        }
    }

    public static void oSum(int[] arr, int n) {
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sonali = new Scanner(System.in);
        int size = sonali.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sonali.nextInt();
        }

        // 1. Find max,min
        // System.out.println(max(arr,size));

        // 2. find ele
        int findEle = 10;
        // System.out.println(find(arr,size,findEle));

        // 3. Span of any array
        // max - min = span;
        // System.out.println(span(arr,size));

        // 4. reverse
        // reverse(arr,size);

        // 5. Osum
        oSum(arr, size);
    }
}
