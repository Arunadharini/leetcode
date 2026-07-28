class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        int open=0;
        int close=0;
        List<String> res = new ArrayList<>();
        genpar(n,sb,res,open,close);
        return res;
    }
    public void genpar(int n , StringBuilder sb,List<String>res , int op,int cl){
        if(sb.length()==2*n){
            res.add(sb.toString());
            return;
        }
        if(op<n){
            sb.append('(');
            genpar(n,sb,res,op+1,cl);
            sb.deleteCharAt(sb.length()-1);
        }
        if(cl<op){
            sb.append(')');
            genpar(n,sb,res,op,cl+1);
            sb.deleteCharAt(sb.length()-1);
        }
        return;
    }
}