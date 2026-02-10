class Solution {
    public int longestValidParentheses(String s) {
        if (s.length()==0 || s.length()==1) return 0;
        Stack<Integer> valid=new Stack<>();
        int count=0;
        valid.push(-1);  
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                valid.push(i);
            }
            else{
                valid.pop();
                if(valid.isEmpty()) valid.push(i);
                else{
                    count=Math.max(count,i-valid.peek());
                }
            }
    }
    return count;
 
}}