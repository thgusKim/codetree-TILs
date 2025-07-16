import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        int aLen = a.length();
        int bLen = b.length();
        int aIdx = 0;
        int bIdx = 0;
        int answer = 0;

        for(int i=0; i<aLen; i++){
            if(a.charAt(i)<'0' || a.charAt(i)>'9'){
                aIdx = i;
                break;
            }
        }

        for(int i=0; i<bLen; i++){
            if(b.charAt(i)<'0' || b.charAt(i)>'9'){
                bIdx = i;
                break;
            }
        }

        if(aIdx == 0)   aIdx = aLen;
        if(bIdx == 0)   bIdx = bLen;

        answer += Integer.parseInt(a.substring(0,aIdx));
        answer += Integer.parseInt(b.substring(0,bIdx));

        System.out.println(answer);
    }
}