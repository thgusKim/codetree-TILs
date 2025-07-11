import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int len = str.length();
        char[] strarr = new char[26];
        int[] cntarr = new int[26];

        strarr[0] = str.charAt(0);
        char c = strarr[0];
        cntarr[0] = 1;
        int idx = 0;

        for(int i=1; i<len; i++){
            if(str.charAt(i) == c){
                cntarr[idx]++;
            }else{
                idx++;
                strarr[idx] = str.charAt(i);
                c = str.charAt(i);
                cntarr[idx]++;
            }
        }

        String answer = "";
        for(int i=0; i<=idx; i++){
            answer += strarr[i];
            answer += cntarr[i];
        }

        System.out.println(answer.length());
        System.out.println(answer);
    }
}