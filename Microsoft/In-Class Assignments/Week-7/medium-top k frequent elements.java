class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>nn=new HashMap();
        for(int e:nums){
            nn.put(e,nn.getOrDefault(e,0)+1);
        }
        Queue <Integer>heap=new PriorityQueue<>((n1,n2)->nn.get(n2)-nn.get(n1));
        for(int e:nn.keySet()){
            heap.add(e);
        } 
        int []arr=new int[k];
        for(int i=k-1;i>=0;i--){
            arr[i]=heap.poll();
        }
        return arr;
    }
}
