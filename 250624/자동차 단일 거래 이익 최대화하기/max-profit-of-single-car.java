import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = sc.nextInt();
        int min = arr[0];
        int result = 0;

        for(int i=1; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < min){
                min = arr[i];
            }else{
                result = Math.max(result, arr[i]-min);
            }
        }

        System.out.println(result);
    }
}