import java.util.Scanner;

public class Main{
    public static boolean isMagic(int n){
        int sum = 0;
        boolean b = false;
        if(n%2 == 0){
            sum += n%10;
            sum += n/10;
            if(sum%5 == 0){
                b = true;
            }
        }
        return b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(isMagic(n) ? "Yes" : "No");
    }
}