class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int it : nums)
        {
            map.put(it,map.getOrDefault(it,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>(nums.length/3)) ans.add(entry.getKey());
        }
        return ans;
    }
}
