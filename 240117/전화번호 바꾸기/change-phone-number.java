import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strArr = s.split("-");
        System.out.println("010-"+strArr[2]+"-"+strArr[1]);
    }
}