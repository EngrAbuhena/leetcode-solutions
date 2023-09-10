class Solution {
    public boolean isPalindrome(int num) {
        // convert integer to string
		String str = Integer.toString(num);
		System.out.println(str);
		
		// reverse the string
		String str2="";
		char ch;
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			str2 = ch+str2;
		}
		System.out.println(str2);
		
		
		if(str.equals(str2))
			return true;
		
		return false;
    }
}
