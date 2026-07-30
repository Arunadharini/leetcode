class Solution {
    int ans=0;
    public int maximumRequests(int n, int[][] requests) {
        int[] houses=new int[n];
        request(0, requests,houses,0);
        return ans;
    }
    public void request(int i , int[][] requests,int[] houses,int count){
        //base case
        if(i==requests.length){
            for(int val:houses){
                if(val!=0) return;
            }
            ans=Math.max(count,ans);
            return;
        }

        //pick
        houses[requests[i][0]]--;
        houses[requests[i][1]]++;
        request(i+1,requests,houses,count+1);
        houses[requests[i][0]]++;
        houses[requests[i][1]]--;

        //not pick
        request(i+1,requests,houses,count);
    }
}



/**HashMap<Integer,Integer> initial=new HashMap<>();
        HashMap<Integer,Integer> req=new HashMap<>();
        int count=0;
        for(int i =0;i<requests.length;i++){
            initial.put(requests[i][0],initial.getOrDefault(requests[i][0],0)+1);
            req.put(requests[i][1],req.getOrDefault(requests[i][1],0)+1);
        }
        for(Map.Entry<Integer,Integer> e: initial.entrySet()){
            if(e.getValue().equals(req.get(e.getKey()))) count+=e.getValue();
        }
        
        return count;**/