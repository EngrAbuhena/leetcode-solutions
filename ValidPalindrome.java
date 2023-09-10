class Solution {
    public boolean isPalindrome(String str) {
        // removing non-alphanumeric characters
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();
        System.out.println(str);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
