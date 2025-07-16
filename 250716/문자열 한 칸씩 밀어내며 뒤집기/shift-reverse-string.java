import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();
        int len = s.length();

        for(int i=0; i<q; i++){
            int qType = sc.nextInt();

            if(qType == 1){
                s = s.substring(1) + s.substring(0,1);
                System.out.println(s);
            }else if(qType == 2){
                s = s.substring(len-1, len) + s.substring(0, len-1);
                System.out.println(s);
            }else if(qType == 3){
                char[] arr = new char[len];
                for(int j=len-1; j>=0; j--){
                    arr[j] = s.charAt(j);
                    System.out.print(arr[j]);
                }
                System.out.println();
            }
        }
    }
}