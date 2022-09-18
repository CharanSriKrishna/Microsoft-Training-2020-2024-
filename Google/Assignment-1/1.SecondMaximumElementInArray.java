import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] values = new int[n];
		for(int i=0;i<n;i++){
		    values[i]=scanner.nextInt();
		}
		int max=values[0],secmax=values[0];
		for(int i=0;i<n;i++){
		    if(values[i]>max){
		        secmax=max;
		        max=values[i];
		    }
		}
		System.out.println(secmax);
	}
}
