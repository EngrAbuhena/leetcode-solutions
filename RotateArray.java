class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;

        k=k%n;

        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    private static void reverse(int[] arr, int start, int end)
    {
        while(start<end)
        {
            // swap
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
}
