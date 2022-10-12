class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int st=1,ed=x;
        while(st<ed)
        {
            int mid=st+(ed-st)/2;
            if(mid<=(x/mid) && (mid+1)>x/(mid+1)){
                 return mid;
            }
            else if (mid>x/mid){
                 ed=mid;
            }
            else{
                 st=mid+1;
            }
        }
        return st;
    }
    
}
