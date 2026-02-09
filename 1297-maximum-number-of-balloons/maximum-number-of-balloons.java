class Solution {
    public int maxNumberOfBalloons(String text) {
      int[] freq = new int[26];
      for(char ch : text.toCharArray()){
        freq[ch-'a']++;
      }
      int Acount = freq[0];
      int Bcount= freq[1];
      int Lcount=freq['l'-'a']/2;
      int Ocount =freq['o'-'a']/2;
      int Ncount=freq['n'-'a'];

      int count = Math.min(Math.min(Math.min(Acount,Bcount),Math.min(Lcount,Ocount)),Ncount);
      return count;
    }
}