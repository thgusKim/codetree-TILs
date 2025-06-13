import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] count_arr = new int[5];

        for(int i=0; i<3; i++){
            char yn = sc.next().charAt(0);
            int temp = sc.nextInt();

            if(yn == 'Y'){
                if(temp >= 37){
                    count_arr[0]++;
                }else{
                    count_arr[2]++;
                }
            }else{
                if(temp >= 37){
                    count_arr[1]++;
                }else{
                    count_arr[3]++;
                }
            }
        }

        for(int i=0; i<4; i++){
            System.out.print(count_arr[i] + " ");
        }

        if(count_arr[0] >= 2){
            System.out.print("E");
        }
    }
}