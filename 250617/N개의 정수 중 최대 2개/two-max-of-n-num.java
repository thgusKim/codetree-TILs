import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        if(arr[1] > arr[0]){
            arr[2] = arr[0];
            arr[0] = arr[1];
            arr[1] = arr[2];
        }

        for(int i=2; i<n; i++){
            arr[i] = sc.nextInt();

            if(arr[0] < arr[i]){
                arr[1] = arr[0];
                arr[0] = arr[i];
            }else if(arr[1] < arr[i]){
                arr[1] = arr[i];
            }
        }

        System.out.println(arr[0] + " " + arr[1]);

    }
}