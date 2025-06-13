import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] countArr = new int[10];
        int ans = 0; 
        int temp = 0;

        for(int i=0; i<500; i++){
            if(a == 0) break;
            temp = a/b;
            countArr[a % b]++;
            a = temp;
        }

        for(int i=0; i<10; i++){
            ans += countArr[i] * countArr[i];
        }

        System.out.println(ans);
    }
}