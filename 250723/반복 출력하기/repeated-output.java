import java.util.Scanner;

public class Main{
    public static void printStr(int n){
        for(int i=0; i<n; i++){
            System.out.println("12345^&*()_");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStr(n);
    }
}