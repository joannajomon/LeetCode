class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0, k=nums.length-1;
        while(i<=k){
            if(nums[i]==val){
                int t=nums[k];
                nums[k]=nums[i];
                nums[i]=t;
                k--;
            }
            
            else {
             i++;
            }
        }
        return i;
    }
}