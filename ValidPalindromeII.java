class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right)) {
                boolean x=solve(s,left+1,right);
                boolean y=solve(s,left,right-1);
                if(x||y) return true;
                else return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean solve(String s, int l, int r)
    {
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
