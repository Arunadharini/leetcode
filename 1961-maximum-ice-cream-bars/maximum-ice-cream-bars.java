class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=Arrays.stream(costs).max().getAsInt();
        int[] count_sort=new int[max+1];
        for(int i=0;i<costs.length;i++){
            count_sort[costs[i]]++;
        }
        int j=0;
        int ans=0;
        for(int i=1;i<count_sort.length;i++){
            while(count_sort[i]>0){
                costs[j]=i;
                ans+=i;
                if(ans>coins) return j;
                count_sort[i]--;
                j++;
            }
        }
        if(ans<=coins) return costs.length;
        return 0;
    }
}