import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int min = 1000;
        int max = 0;

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<10; i++){
            if(arr[i] < 500 && arr[i] > max){
                max = arr[i];
            }else if(arr[i] > 500 && arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(max + " " + min);
    }
}