class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int best=values[0]+0;
        int max=best;
        for(int i=1;i<values.length;i++){
            max=Math.max(max,best+values[i]-i);
            best=Math.max(best,values[i]+i);
        }
        return max;
    }
}