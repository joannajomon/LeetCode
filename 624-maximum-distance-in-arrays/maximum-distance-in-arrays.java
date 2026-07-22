class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=arrays.get(0).get(0);
        int max=arrays.get(0).get(arrays.get(0).size()-1);
        int ans=0;
        for(int i=1;i<arrays.size();i++){
           List<Integer> arr=arrays.get(i);
           int currentMin=arr.get(0);
           int currentMax=arr.get(arr.size()-1);
           ans= Math.max(ans,Math.max(currentMax-min, max-currentMin));
           min=Math.min(min,currentMin);
        max=Math.max(max,currentMax);
        }
        
    return ans;
    }
}