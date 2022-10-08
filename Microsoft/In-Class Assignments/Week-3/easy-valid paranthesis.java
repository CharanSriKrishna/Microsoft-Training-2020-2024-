class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        Map<Character,Character> map=new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                char top=st.empty()?' ':st.pop();
                if(top!=map.get(c)){
                    return false;
                }
            }else{
                st.push(c);
            }
        }
        
        return st.empty();
    }
}
