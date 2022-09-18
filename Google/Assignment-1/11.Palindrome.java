import java.util.Scanner;
public class Main
{  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length()-1;
        int i=0;
        while(len>i){
        if(str.charAt(i).equals(str.charAt(len)){
            len--;
            i++;
        }
        else{
            System.out.println("Not a Palindrome");
        }
        }
        System.out.println("Palindrome");    
	}
}
