import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();
        s = s.substring(0,1) + s.substring(2,len-2) + s.substring(len-1);

        System.out.println(s);
    }
}