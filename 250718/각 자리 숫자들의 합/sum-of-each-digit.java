import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String nStr = Integer.toString(n);
        int sum = 0;

        for(int i=0; i<nStr.length(); i++){
            sum += Integer.parseInt(nStr.charAt(i)+"");
        }

        System.out.println(sum);
    }
}