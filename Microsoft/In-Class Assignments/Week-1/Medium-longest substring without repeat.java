class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seq = new HashSet<Character>();
        int i=0,j=0,max=0;
        while(j<s.length()){
            if(!(seq.contains(s.charAt(j)))){
                seq.add(s.charAt(j));
                max=Math.max(seq.size(),max);
                j++;
            }
            else{
                seq.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
