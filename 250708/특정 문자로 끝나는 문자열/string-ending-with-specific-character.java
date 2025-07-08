import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] str = new String[10];
        boolean flag = false;

        for(int i=0; i<10; i++){
            str[i] = sc.next();
        }

        char word = sc.next().charAt(0);

        for(int i=0; i<10; i++){
            if(str[i].charAt(str[i].length()-1) == word){
                System.out.println(str[i]);
                flag = true;
            }
        }
        
        if(flag == false) System.out.println("None");
    }
}