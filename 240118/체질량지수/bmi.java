import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cm = sc.nextInt();
        int kg = sc.nextInt();

        System.out.println((kg*10000)/(cm*cm));
        if((kg*10000)/(cm*cm) >= 25){
            System.out.println("Obesity");
        }
    }
}