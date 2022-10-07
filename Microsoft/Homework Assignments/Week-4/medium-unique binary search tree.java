class Solution {
    public int numTrees(int n) {
        int k=2*n;
        long up=1;
        long down =1;
        int j=n+1;
        for(int i=1;i<=n && j<=k;i++){
            up*=i;
            down*=j;
            if(down%up==0){
                down=down/up;
                up=1;
            }
            j++;
        }
        //System.out.println(up);
        return (int)((down/up)/(long)(n+1));
    }
}
