import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int[] count_arr = new int[10];
        int cnt = 0;

        for(int i=0; i<100; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0) {
                cnt = i;
                break;
            }
            arr[i] = arr[i]/10%10;
        }

        for(int i=0; i<cnt; i++){
            count_arr[arr[i]]++;
        }

        for(int i=1; i<10; i++){
            System.out.println((i) + " - " + count_arr[i]);
        }
    }
}