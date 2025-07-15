import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int cnt = sc.nextInt();
        int len = s.length();
        char[] arr = s.toCharArray();

        for(int i=0; i<cnt; i++){
            int num = sc.nextInt();

            if(num == 1){
                int a = sc.nextInt();
                int b = sc.nextInt();
                char temp = 'a';
                
                temp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = temp;
            }else{
                char x = sc.next().charAt(0);
                char y = sc.next().charAt(0);

                for(int j=0; j<len; j++){
                    if(arr[j] == x){
                        arr[j] = y;
                    }
                }
            }

            for(int j=0; j<len; j++){
                    System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}