class Solution {
    public int fib(int n) {
        // first index is 0
        if(n<=1) return n;

        return fib(n-1)+fib(n-2);
    }
}
