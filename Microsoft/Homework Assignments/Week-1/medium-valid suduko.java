class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen=new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char cur=board[i][j];
                if(cur!='.'){
                    if(!seen.add(cur+"row"+i) || !seen.add(cur+"col"+j) || !seen.add(cur+"row.col"+i/3+"_"+j/3))
                    return false;
                }
            }
        }
        return true;
    }
}
