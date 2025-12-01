class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0,right=n-1;
        int leftm=0, rightm=0;
        int res=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(height[left]>=leftm){
                    leftm=height[left];
                }
                else {
                    res+=leftm-height[left];
                }
                left++;
            }else{
                if(height[right]>=rightm){
                    rightm=height[right];
                }else{
                    res+=rightm-height[right];
                }
                right--;
            }
        }
        return res;
    }
}