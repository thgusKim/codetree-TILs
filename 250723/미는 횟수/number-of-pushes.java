import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        int len = a.length();
        int cnt = 1;

        for(int i=0; i<len; i++){
            a = a.substring(len-1, len) + a.substring(0,len-1);
            if(a.equals(b)){
                break;
            }
            cnt++;
        }

        if(cnt == len+1){
            System.out.println(-1);
        }else{
            System.out.println(cnt);
        }
    }
}