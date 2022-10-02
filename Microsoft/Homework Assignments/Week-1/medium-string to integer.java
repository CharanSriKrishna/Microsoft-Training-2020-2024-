class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int start=0;
        long sign=1;
        if(s.length()==0)return 0;
        if(s.charAt(0)=='-'){
            start=1;
            sign=-1;
        }
        if(s.charAt(0)=='+'){
            start=1;
            sign=1;
        }
        if(s.length()==1&&start==1)return 0;
        long num=0;
        if(s.charAt(start)<'0' || s.charAt(start)>'9' )return 0;
        else{
            for(int i=start;i<s.length() && (s.charAt(i)>='0' && s.charAt(i)<='9');i++){
                long cur=s.charAt(i)-'0';
                num*=10;
                num+=cur;
                //System.out.println(num);
                if((num*sign)>Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                if((num*sign)<Integer.MIN_VALUE){
                     return Integer.MIN_VALUE;
                }
            }
        }
        return (int)(num*sign);
    }
}
