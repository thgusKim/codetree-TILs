import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        arr[0] = sc.nextInt();
        int max = arr[0];
        
        for(int i=1; i<10; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}