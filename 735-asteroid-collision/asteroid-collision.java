class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int[] stack = new int[asteroids.length];
        int top=-1,i;
        for( i=0;i<asteroids.length;i++){
          if(asteroids[i]>0){
            stack[++top]=asteroids[i];
          }
          else{
            while(top>=0 && stack[top]>0 && Math.abs(asteroids[i])>stack[top] ){
                top--;
               
            }
            if(top==-1 || stack[top]<0){
                stack[++top]=asteroids[i];
            }
            else if (Math.abs(asteroids[i]) == stack[top]) {
                 top--;
               }
          }
          
        }
           int[] ans = new int[top + 1];
   for (int j = 0; j <= top; j++) {
    ans[j] = stack[j];
}
return ans;
    }


}