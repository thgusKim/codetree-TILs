import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();
        // System.out.println("n: "+n);
        int len = str.length();
        // System.out.println("len: "+len);
        int answerlen = (len-n > 0) ? len-n : n;
        // System.out.println(answerlen);
        
        for(int i=len-1; i>=answerlen; i--){
            System.out.print(str.charAt(i));
        }
    }
}