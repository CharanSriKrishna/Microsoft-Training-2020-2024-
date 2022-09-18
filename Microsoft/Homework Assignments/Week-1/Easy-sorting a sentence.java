class Solution {
    public String sortSentence(String s) {
        Map<Integer,String> wrd=new HashMap<>();
        for(String word : s.split(" ")){
            int lastInd=word.length()-1;
            int index=word.charAt(lastInd)-'0';
            String actwrd=word.substring(0,lastInd);
            wrd.put(index,actwrd);
            System.out.println(index+actwrd);
        }
        StringBuilder actualString=new StringBuilder();
        for(Map.Entry<Integer,String>indexWord:wrd.entrySet()){
            actualString.append(indexWord.getValue());
            actualString.append(" ");
        }
    
    return actualString.toString().trim();
}}
