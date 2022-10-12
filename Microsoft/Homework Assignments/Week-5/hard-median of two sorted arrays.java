class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k=nums1.length+nums2.length;
        int [] nums3=new int[k];
        int j=0,m=0;
        for(int i=0;i<k;i++){
            if(m==nums1.length){
                while(i<k){
                    nums3[i]=nums2[j];
                    j++;
                    i++;
                }
            }
            else if(j==nums2.length){
                while(i<k){
                    nums3[i]=nums1[m];
                    m++;
                    i++;
                }
            }
            else if(nums1[m]<nums2[j]){
                nums3[i]=nums1[m];
                m++;
            }
            else{
                nums3[i]=nums2[j];
                j++;
            }
        }
        if(k%2==1){
            //System.out.println(nums3[k/2]);
            return nums3[k/2];
        }
        else{
            //System.out.println((nums3[k/2]+" "+nums3[(k/2)-1]));
            return (nums3[k/2]+nums3[(k/2)-1])/2.0;
        }
    }
}
