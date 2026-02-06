class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> calc=new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                int num1=calc.pop();
                int num2=calc.pop();
                calc.push(num1+num2);
            }
            else if(s.equals("-")){
                int num1=calc.pop();
                int num2=calc.pop();
                calc.push(num2-num1);
            }
            else if(s.equals("*")){
                int num1=calc.pop();
                int num2=calc.pop();
                calc.push(num1*num2);
            }
            else if(s.equals("/")){
                int num1=calc.pop();
                int num2=calc.pop();
                calc.push(num2/num1);
            }
            else{
                calc.push(Integer.parseInt(s));
            }
        }
        return calc.peek();
    }
}