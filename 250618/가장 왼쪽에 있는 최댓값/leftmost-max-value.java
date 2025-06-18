import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int cnt = n;
        int temp = cnt;

        // 입력
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // max가 1이 되기 전까지 반복
        while(cnt != 1){
            max = 0;

            // cnt만큼 반복
            for(int i=0; i<cnt-1; i++){
                // arr[i]가 max 값보다 크다면
                if(arr[i] > max){
                    max = arr[i];
                    temp = i+1;
                }
            }
            cnt = temp;           
            System.out.print(cnt + " ");
        }
        
    }
}