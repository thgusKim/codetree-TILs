import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = -1;

        // arr에 정수 저장
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // n개만큼 for문
        for(int i=0; i<n; i++){
            boolean duplicate = false;

            // arr[i]가 max 보다 크면
            if(arr[i] > max){
                // 0~n개까지 돌면서 중복되는 정수가 있는지 확인
                for(int j=0; j<n; j++){
                    // 중복된다면 max에 저장하지 않고 break
                    if(i != j && arr[i] == arr[j]){
                        duplicate = true;
                        break;
                    }
                }
                if(duplicate == false){
                    // 중복되지 않는다면 max에 새롭게 저장
                    max = arr[i];
                }
            }
        }

        System.out.println(max);
    }
}