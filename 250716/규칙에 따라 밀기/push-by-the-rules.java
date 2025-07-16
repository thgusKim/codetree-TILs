import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String q = sc.next();
        int sLen = s.length();
        int qLen = q.length();

        for(int i=0; i<qLen; i++){
            if(q.charAt(i) == 'L'){
                s = s.substring(1) + s.substring(0,1);
            }else{
                s = s.substring(sLen-1, sLen) + s.substring(0, sLen-1);
            }
        }
        System.out.println(s);
    }
}