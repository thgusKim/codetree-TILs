import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arrA = new int[n1];
        int[] arrB = new int[n2];
        boolean satisfied = true;
        int cnt = 0;

        for(int i=0; i<n1; i++){
            arrA[i] = sc.nextInt();
        }

        for(int i=0; i<n2; i++){
            arrB[i] = sc.nextInt();
        }

        for(int i=0; i<n1; i++){
            if(arrA[i] == arrB[0]){
                cnt = i;
            }
        }

        for(int i=cnt; i<n2; i++){
            if(arrA[i+1] != arrB[cnt-i+1]){
                // System.out.print(i+"  "+arrA[i+1] + "   " +arrB[i-cnt+1]);
                satisfied = false;
                break;
            }
        }

        System.out.println((satisfied == true) ? "Yes" : "No");
    }
}