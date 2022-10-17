class Solution {
    public double myPow(double x, int n) {
        if(n==0 )return (double)1;
        double res;
        if(n%2==0) res=pow(x*x,Math.abs(n/2));
        else  res=x*pow(x,Math.abs(n)-1);
        if(n>0){
            return res;
        }
        return 1/res;
    }
    public double pow(double x,int n){
        if(n%2==0) return pow(x*x,Math.abs(n/2));
        else if(n%2==1) return x*pow(x,Math.abs(n)-1);
        return x;
    }
}
