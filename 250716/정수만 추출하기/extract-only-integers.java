import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        int aLen = a.length();
        int bLen = b.length();
        int answer = 0;

        for(int i=0; i<aLen; i++){
            if(a.charAt(i)<='0' || a.charAt(i)>='9'){
                answer += Integer.parseInt(a.substring(0,i));
            }
        }

        for(int i=0; i<bLen; i++){
            if(b.charAt(i)<='0' || b.charAt(i)>='9'){
                answer += Integer.parseInt(b.substring(0,i));
            }
        }

        System.out.println(answer);
    }
}