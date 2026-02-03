class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      Stack<Integer> stack=new Stack<>();
      for(int i =0;i<asteroids.length;i++){
           if(asteroids[i]>=0) stack.push(asteroids[i]);
           else{
            calc(stack,asteroids[i]);
           }
           }
        int[] res = new int[stack.size()];
        int j=0;
        for(int i:stack){
            res[j++]=i;
        }
        return res;
}
public void calc(Stack<Integer> stack ,int n){
    while(!stack.isEmpty()  && (n<0 && stack.peek()>0) ){
            if(Math.abs(n)>stack.peek()) stack.pop();
            else if(Math.abs(n) == stack.peek()) { 
            stack.pop();
            return;}
            else if(Math.abs(n)<stack.peek()) return;
    }
        stack.push(n)  ;
    }

}  