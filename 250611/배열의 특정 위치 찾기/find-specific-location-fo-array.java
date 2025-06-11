import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int ans1=0; 
        int ans2=0;

        for(int i=0; i<10;i++){
            arr[i]=sc.nextInt();
            if(i%2!=0) ans1 += arr[i];
            if(i%3==2) ans2 += arr[i];
        }

        System.out.printf("%d %.1f",ans1,(double)ans2/3);
    }
}