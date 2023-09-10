class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int it:nums)
        {
            map.put(it,map.getOrDefault(it,0)+1);
        }
        int[] arr = new int[2];
        int i=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                arr[i]=entry.getKey();
                i++;
            }
        }
        return arr;
    }
}
