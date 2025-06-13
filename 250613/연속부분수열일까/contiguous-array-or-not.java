import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arrA = new int[n1];
        int[] arrB = new int[n2];
        boolean satisfied = false;

        for(int i=0; i<n1; i++){
            arrA[i] = sc.nextInt();
        }

        for(int i=0; i<n2; i++){
            arrB[i] = sc.nextInt();
        }

        for(int i=0; i<n1; i++){
            if(arrA[i]==arrB[0]){
                for(int j=0; j<n2-1; j++){
                    if(arrA[i+j] == arrB[j] && arrA[i+j+1] == arrB[j+1]){
                        // System.out.println(arrA[i+j]+"  "+ arrB[j]);
                        satisfied = true;
                    }else{
                        satisfied = false;
                        break;
                    }
                }
            }
            if(satisfied == true){
                break;
            }
        }

        System.out.println((satisfied == true) ? "Yes" : "No");
    }
}