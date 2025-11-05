class Solution {
    public int candy(int[] ratings) {
        int l=ratings.length;
        int [] arr= new int[l];
        Arrays.fill(arr,1);
        for(int i=1;i<l;i++){
            if(ratings[i]>ratings[i-1]){
                arr[i]=arr[i-1]+1;
            }
        }
        for(int i=l-2;i>-1;i--){
            if(ratings[i]>ratings[i+1]){
                arr[i]=Math.max(arr[i],arr[i+1]+1);
            }
        }
        int sum=0;
        for(int a:arr)
           sum+=a;
        return sum;
    }
}