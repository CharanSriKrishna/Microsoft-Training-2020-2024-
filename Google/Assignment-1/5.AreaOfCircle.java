import java.util.Scanner;
public class Main
{   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double area = Math.PI*r*r;
		System.out.println(area);
		System.out.printf("%.2f",(float)area);
	}
}
