import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] count_arr = new int[7];

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<10; i++){
            count_arr[arr[i]]++;
        }

        for(int i=0; i<6; i++){
            System.out.println((i+1) + " - " + count_arr[i+1]);
        }
    }
}