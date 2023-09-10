class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int it:nums)
        {
            map.put(it,map.getOrDefault(it,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>1) return entry.getKey();
        }
        return -1;
    }
}
