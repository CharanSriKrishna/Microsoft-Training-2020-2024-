import java.util.Scanner;
public class Main
{  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev ="";
        int len = str.length();
        int i=len-1;
        while(i>=0){
            rev=rev+str.charAt(i);
            i--;
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
	}
}
