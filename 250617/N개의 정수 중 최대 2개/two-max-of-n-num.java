import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = sc.nextInt();
        int temp = 0;
        
        for(int i=1; i<n; i++){
            arr[i] = sc.nextInt();

            for(int j=i-1; j>=0; j--){
                if(arr[j+1] < arr[j]){
                    break;
                }else{
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(arr[0] + " " + arr[1]);

    }
}