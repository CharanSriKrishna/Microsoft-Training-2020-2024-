import java.util.Scanner;
public class Main
{   public static void mean(int[] arr,int  n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum/n);
    }
    public static void median(int[] arr,int n){
        int mid = n/2;
        if(n%2!=0){
            System.out.println(arr[mid]);
        }
        else{
            System.out.println((arr[mid]+arr[mid+1])/2);
        }
    }
    public static void mode(int arr[] ,int n){
        int max=arr[0],maxcount=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                }
            }
            if(count>maxcount){
                maxcount=count;
                max=arr[i];
            }
        }
        System.out.println(max);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int[] arrs = new int[n];
	    for(int i=0;i<n;i++){
	        arrs[i]=sc.nextInt();
	    }

	    mean(arrs,n);
	    median(arrs ,n);
	    mode(arrs,n);
	}
}
