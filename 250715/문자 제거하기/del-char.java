import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int sLen = s.length();

        for(int i=0; i<sLen-1; i++){
            int idx = sc.nextInt();
            int len = s.length();
            
            if(idx == 0){
                s = s.substring(1, len);
                System.out.println(s);
            }else if(idx >= len){
                s = s.substring(0, len-1);
                System.out.println(s);
            }else{
                s = s.substring(0,idx) + s.substring(idx+1);
                System.out.println(s);
            }
        }

    }
}