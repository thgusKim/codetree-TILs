import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        if(m < 3 || m==12){
            System.out.println("Winter");
        }else if(m < 6){
            System.out.println("Spring");
        }else if(m < 9){
            System.out.println("Summer");
        }else{
            System.out.println("Fall");
        }
    }
}