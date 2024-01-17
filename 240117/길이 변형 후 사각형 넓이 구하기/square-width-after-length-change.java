import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 변수 선언
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a += 8;
        b *= 3;

        // 출력
        System.out.println(a);
        System.out.println(b);
        System.out.println(a*b);
    }
}