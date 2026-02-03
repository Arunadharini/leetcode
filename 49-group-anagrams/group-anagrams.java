class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map =new HashMap<>();
         List<List<String>> res= new ArrayList<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        for(List<String> valuesList : map.values()){
            res.add(valuesList);
        }    
        return res;  
    }
}