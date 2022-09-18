import java.util.Scanner;
public class Main
{   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		double area1 = Math.abs(x1*(y2-y3)+x2*(y1-y3)+x3*(y1-y2));
		System.out.println(area1/2);
		double area2 = Math.abs(x1*(y1-y2)+x2*(y1-y3)+x3*(y1-y2));
		System.out.println(area2/2);
	}
}
