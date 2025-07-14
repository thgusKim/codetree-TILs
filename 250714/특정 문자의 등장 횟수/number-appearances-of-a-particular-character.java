import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int eeIdx = 0;
        int ebIdx = 0;
        int len = s.length();

        for(int i=0; i<len-1; i++){
            if(s.substring(i, i+2).equals("ee"))    eeIdx++;
            if(s.substring(i, i+2).equals("eb"))    ebIdx++;
        }

        System.out.print(eeIdx+" "+ebIdx);
    }
}