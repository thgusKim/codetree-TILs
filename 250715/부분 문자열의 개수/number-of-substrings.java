import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        int aLen = a.length();
        int bLen = b.length();
        int cnt = 0;

        for(int i=0; i<aLen-1; i++){
            if(a.substring(i, i+bLen).equals(b)){
                cnt++;
            }
        }

        System.out.println(cnt);
        
    }
}