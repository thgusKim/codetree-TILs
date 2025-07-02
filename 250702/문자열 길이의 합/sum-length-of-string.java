import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        int lenAll = 0;
        int acnt = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        for(int i=0; i<n; i++){
            if(arr[i].charAt(0) == 'a'){
                acnt++;
            }
            lenAll += arr[i].length();
        }

        System.out.println(lenAll + " " + acnt);
    }
}