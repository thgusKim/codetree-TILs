import java.util.Scanner;

public class Main{
    public static int power(int a, int b){
        int powerNum = 1;
        for(int i=1; i<=b; i++){
            powerNum *= a;
        }
        return powerNum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(power(a, b));
    }
}