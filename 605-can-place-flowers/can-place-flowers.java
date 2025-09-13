class Solution {  //check left and right if its empty then place 1
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=flowerbed.length;
        int c=0;
        for(int i=0;i<l;i++){
            if(flowerbed[i]==0){
                boolean emptyLeft=(i==0) || (flowerbed[i-1]==0);
                boolean emptyRight=(i==l-1)||(flowerbed[i+1]==0);
                if(emptyLeft && emptyRight){
                    flowerbed[i]=1;
                    c++;
                }
            }
        }
        return c>=n;  //returns true if the condition is true
    }
}