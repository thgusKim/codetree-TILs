import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        arr[0] = sc.nextInt();
        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<100; i++){
            arr[i] = sc.nextInt();

            if(arr[i] == 999 || arr[i] == -999){
                System.out.println(max + " " + min);
                break;
            }

            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }
        }
    }
}
