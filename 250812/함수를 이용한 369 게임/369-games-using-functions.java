import java.util.Scanner;

public class Main{
    public static boolean in369(int n){
        while (n > 0) {
            int d = n % 10;
            if (d == 3 || d == 6 || d == 9) return true;
            n /= 10;
        }
        return false;
    }

    public static boolean isMagicNum(int n){
        return n%3==0 || in369(n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i=a; i<=b; i++){
            if(isMagicNum(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}