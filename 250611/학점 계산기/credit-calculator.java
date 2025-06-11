import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        double avg = 0;
        String grade = "";

        for(int i=0; i<n; i++){
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        avg = Math.round(sum*10/n)/10.0;

        if(avg >= 4.0){
            grade = "Perfect";
        }else if(avg >= 3.0){
            grade = "Good";
        }else{
            grade = "Poor";
        }

        System.out.println(avg);
        System.out.println(grade);
    }
}