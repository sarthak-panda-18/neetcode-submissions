class Solution {
    public int majorityElement(int[] a) {
        int n = a.length;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int x:a){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>n/2)
            return entry.getKey();
        }
        return -1;
    }
}