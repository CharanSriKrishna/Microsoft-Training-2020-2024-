class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer>qu=new LinkedList();
        for(int i=0;i<students.length;i++){
            qu.add(students[i]);
        }
        int i=0;
        int k=0;
        while(i<sandwiches.length){
            if(sandwiches[i]==qu.peek()){
                qu.poll();
                i++;
                k=0;
            }
            else{
                if(k==qu.size())break;
                qu.add(qu.poll());
                k++;
            }
        }
        return qu.size();
    }
}
