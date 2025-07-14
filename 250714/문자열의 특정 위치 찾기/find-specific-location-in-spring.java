import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char c = sc.next().charAt(0);
        int len = s.length();
        int idx = 0;
        boolean b = false;

        for(int i=0; i<len-1; i++){
            if(s.charAt(i)==c){
                idx = i;
                b = true;
                break;
            }
        }

        System.out.print(b==true?idx:"No");
    }
}