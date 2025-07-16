import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();

        for(int i=0; i<len; i++){
            if(s.charAt(i) == 'e'){
                s = s.substring(0,i) + s.substring(i+1);
            }
        }
        System.out.println(s);
    }
}