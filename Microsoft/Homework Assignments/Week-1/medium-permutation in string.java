class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []hash1=new int[26];
        int []hash2=new int[26];
        int sn1=s1.length();
        int sn2=s2.length();
        if(sn1>sn2)return false;
        int right=0,left=0;
        while(right<sn1){
            hash1[s1.charAt(right)-'a']++;
            hash2[s2.charAt(right)-'a']++;
            right++;
        }
        right-=1;
        while(right<sn2){
            if(helper(hash1,hash2)){
                return true;
            }
            right++;
            if(right!=sn2) hash2[s2.charAt(right)-'a']++;
            hash2[s2.charAt(left)-'a']--;
            
            left++;
            
        }
        return false;
    }
    public boolean helper(int[]hash1,int[]hash2){
        int count=0;
        for(int i=0;i<26;i++){
                if(hash1[i]!=hash2[i]){
                    count=1;
                    break;
                }
            }
        if(count==0){
            return true;
        }
        return false;
    }
}
