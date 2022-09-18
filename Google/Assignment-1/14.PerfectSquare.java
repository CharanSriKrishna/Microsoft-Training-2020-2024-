public class Main
{   public static boolean PerfectSquare(double n){
    if(n==0){
        return false;
    }
    else{
        for(int i=1;i*i<=n;i++){
            if(n%i==0 && n/i==i){
                return true;
            }
        }
        return false;
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if(PerfectSquare(n)==true){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not a Perfect Square");
        }
	}
}
