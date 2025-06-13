import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<q; i++){
            int cases = sc.nextInt();
            int num1 = sc.nextInt();

            if(cases == 1){
                System.out.println(arr[num1-1]);

            }else if(cases == 2){
                int idx = -1;
                for(int j=0; j<n; j++){
                    if(arr[j] == num1){
                        idx = j+1;
                        break;
                    }
                }
                System.out.println((idx == -1) ? 0 : idx);

            }else{
                int num2 = sc.nextInt();

                for(int j=num1; j<=num2; j++){
                    System.out.print(arr[j-1] + " ");
                }
                System.out.println();
            }
        }
    }
}