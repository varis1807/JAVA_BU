package basics;
public class concatenationStr {
    
    public static void concat(String str){
        int i = 0, j=str.length()-1;
        while(j-i>=2){
            char ch = str.charAt(i);
            char ch2 = str.charAt(j);
            System.out.print(ch);
            System.out.print(ch2);
            i++;
            j--;
        }
        System.out.print(str.charAt(str.length()/2));
    }
    public static void main(String[] args){
        String str = "varis";
        concat(str);
    }
}
