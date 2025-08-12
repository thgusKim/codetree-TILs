import java.util.Scanner;

public class Main{
    public static boolean in369(int n){
        int temp = 1;

        while(true){
            if((n%10) == 3 || (n%10) == 6 || (n%10) == 9){
                return true;
            }else if(n/temp != 0 && (n/temp)%3 == 0){
                return true;
            }else if(n/temp == 0){
                return false;
            }
            temp *= 10;
        }
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