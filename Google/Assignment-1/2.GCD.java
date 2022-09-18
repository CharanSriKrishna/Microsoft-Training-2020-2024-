import java.util.Scanner;
public class Main
{   
    public static int GCD(int a,int b){
        if(a==0){
            return b;
        }
        return GCD(b%a,a);
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(GCD(a,b));
	}
}
