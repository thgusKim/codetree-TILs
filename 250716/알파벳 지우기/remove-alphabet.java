import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String aa = "";
        String bb = "";

        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)>='0' && a.charAt(i)<='9'){
                aa += a.charAt(i);
            }
        }

        for(int i=0; i<b.length(); i++){
            if(b.charAt(i)>='0' && b.charAt(i)<='9'){
                bb += b.charAt(i);
            }
        }

        System.out.println(Integer.parseInt(aa) + Integer.parseInt(bb));
    }
}