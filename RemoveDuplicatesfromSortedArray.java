class Solution {
    public int removeDuplicates(int[] arr) {
        int count = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[count] != arr[j]) {
                count++;
                arr[count] = arr[j];
            }
        }

        return count + 1;
    }
}
