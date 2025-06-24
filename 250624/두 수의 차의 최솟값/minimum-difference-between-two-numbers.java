import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = 100;
        arr[0] = sc.nextInt();

        for(int i=1; i<n; i++){
            arr[i] = sc.nextInt();

            if(arr[i] - arr[i-1] < min){
                min = arr[i] - arr[i-1];
            }
        }

        System.out.println(min);
    }
}