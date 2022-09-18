import java.util.Scanner;
public class Main
{   
    public static int GCD(int a,int b){
	int gcd=1;
        for(int i = 1; i <= a && i <= b; i++)  
	{  
		if(a%i==0 && b%i==0)  
		gcd = i;  
	}  
	return gcd;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(GCD(a,b));
	}
}
