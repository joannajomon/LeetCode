class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
     HashSet<Integer> set= new HashSet<>();
     HashSet<Integer> set1= new HashSet<>();
     int ans1=0,ans2=0;
     for(int x: nums1){
        set.add(x);
     }
     for(int x:nums2){
     if(set.contains(x)){
        ans2++;
     }
     }
     for(int x: nums2){
        set1.add(x);
     }
      for(int x:nums1){
       if(set1.contains(x)){
        ans1++;
     }
     }
        return new int[]{ans1, ans2};
    }
 
}