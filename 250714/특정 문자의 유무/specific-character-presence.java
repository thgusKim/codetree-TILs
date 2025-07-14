import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        boolean eeExists = false;
        boolean abExists = false;
        int len = str.length();

        for(int i=0; i<len-1; i++){
            if(str.substring(i, i+2).equals("ee")){
                eeExists = true;
            }
            if(str.substring(i, i+2).equals("ab")){
                abExists = true;
            } 
        }

        System.out.print(eeExists==true?"Yes ":"No ");
        System.out.print(abExists==true?"Yes":"No");
    }
}