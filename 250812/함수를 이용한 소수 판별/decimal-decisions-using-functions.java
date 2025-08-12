import java.util.Scanner;

public class Main{
    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int sumPrime(int a, int b){
        int sum = 0;

        for(int i=a; i<=b; i++){
            if(isPrime(i)){
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(sumPrime(a, b));
    }
}