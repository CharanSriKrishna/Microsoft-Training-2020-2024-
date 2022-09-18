import java.util.Scanner;
public class Main
{  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==j){
                    mat[i][j]=1;
                    System.out.print("1");
                }
                else if(j==0){
                    mat[i][j]=1;
                    System.out.print("1");
                }
                else{
                    mat[i][j]=mat[i-1][j]+mat[i-1][j-1];
                    System.out.print(mat[i][j]);
                }
            }
            System.out.println();
        }
	}
}
/*input
4 
1
11
121
1331
*/
