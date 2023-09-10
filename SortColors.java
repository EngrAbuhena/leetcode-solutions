class Solution {
    public void sortColors(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int it:arr) {
            if (it == 0) list.add(it);
        }
        for (int it:arr) {
            if (it == 1) list.add(it);
        }
        for (int it:arr) {
            if (it == 2) list.add(it);
        }
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=list.get(i);
        }
    }
}
