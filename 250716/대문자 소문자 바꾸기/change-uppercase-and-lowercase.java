import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int len = str.length();

        for(int i=0; i<len; i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                System.out.print((char)(str.charAt(i)-'A'+'a'));
            }else{
                System.out.print((char)(str.charAt(i)-'a'+'A'));
            }
        }
    }
}