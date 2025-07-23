import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += sc.nextInt();
        }

        String sumStr = Integer.toString(sum);
        System.out.println(sumStr.substring(1,sumStr.length()) + sumStr.substring(0,1));
    }
}