import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for(int i=0; i<n; i++){
            if(i%2==0){
                cnt = (i*n)+1;
                for(int j=0; j<n; j++){
                    System.out.print(cnt++ + " ");
                }
            }else{
                cnt = (i+1)*n;
                for(int j=0; j<n; j++){
                    System.out.print(cnt-- + " ");
                }
            }
            System.out.println();
        }
    }
}