import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mid = sc.nextInt();
        int fin = sc.nextInt();

        if(mid < 90 || fin < 90){
            System.out.println(0);
        }else if(fin <95){
            System.out.println(50000);
        }else{
            System.out.println(100000);
        }
    }
}