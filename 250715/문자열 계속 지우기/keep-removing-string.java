import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int aLen = a.length();
        int bLen = b.length();

        for(int i=0; i<aLen-bLen+1; i++){

            if(a.substring(i, i+bLen).equals(b)){
                a = a.substring(0,i) + a.substring(i+bLen);
                i=0;
            }
            aLen = a.length();
        }
        System.out.println(a);

    }
}