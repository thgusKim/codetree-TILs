public class Main{
    public static void main(String[] args){
        int n = 5;
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}