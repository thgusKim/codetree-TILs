import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int c = (int)sc.next().charAt(0);
        char answer = (char)(c+1);
        if(c == 'z')    answer = 'a';
        System.out.println(answer);
    }
}