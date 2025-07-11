import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        int len = str.length();
        int endIdx = (n >= len) ? 0 : len-n;

        for(int i=len-1; i>=endIdx; i--){
            System.out.print(str.charAt(i));
        }
    }
}