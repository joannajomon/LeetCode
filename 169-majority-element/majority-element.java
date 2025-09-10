class Solution {
    public int majorityElement(int[] nums) {
       
        int candidate=0;
        int c=0;
        for(int num:nums){
            if(c==0){
                candidate=num;
            }
             c+=(num==candidate)?1:-1;
        }
        return candidate;
        
            }
}