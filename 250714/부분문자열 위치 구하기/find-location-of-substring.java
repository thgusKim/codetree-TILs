import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String s2 = sc.next();
        int len = s.length();

        System.out.println(s.indexOf(s2));
    }
}