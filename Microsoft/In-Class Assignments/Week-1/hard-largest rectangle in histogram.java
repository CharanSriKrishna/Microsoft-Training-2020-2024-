class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        if(n==1)return heights[0];
        int []left=new int [n];
        int []right=new int [n];
        left[0]=-1;
        right[n-1]=n;
        for(int i=1;i<n;i++){
            int temp=i-1;
            while(temp>=0&& heights[temp]>=heights[i]){
                temp=left[temp];
            }
            left[i]=temp;
        }
        for(int i=n-2;i>=0;i--){
            int temp=i+1;
            while(temp<n&& heights[temp]>=heights[i]){
                temp=right[temp];
            }
            right[i]=temp;
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,heights[i]*(right[i]-left[i]-1));
        }
        return max;
    }
}
