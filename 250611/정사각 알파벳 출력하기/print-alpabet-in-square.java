import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = 'A';
        int answer = (int)c;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print((char)answer++);
            }
            System.out.println();
        }
    }
}