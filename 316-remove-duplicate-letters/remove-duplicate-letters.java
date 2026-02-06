class Solution {
    public String removeDuplicateLetters(String s) {
    Stack<Character> st=new Stack<>();
    int[] count =new int[26];
    boolean[] visited =new boolean[26];
    for(char ch : s.toCharArray()){
        count[ch-'a']++;
    }
    for(char ch:s.toCharArray()){
        count[ch-'a']--;
        if(visited[ch-'a']) continue;
        while(!st.isEmpty()  && ch<st.peek() && count[st.peek()-'a']>0 ){
            visited[st.pop()-'a']=false;;
        }
        st.push(ch);
        visited[ch-'a']=true;

    }
    StringBuilder sb = new StringBuilder();
    for(char ch:st) sb.append(ch);
    return sb.toString();
    }
}