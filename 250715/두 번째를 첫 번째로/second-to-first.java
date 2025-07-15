import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();
        int len = s.length();
        char c1 = arr[0];
        char c2 = arr[1];

        for(int i=0; i<len; i++){
            if(arr[i] == c2){
                arr[i] = c1;
            }
        }

        for(int i=0; i<len; i++){
            System.out.print(arr[i]);
        }
    }
}