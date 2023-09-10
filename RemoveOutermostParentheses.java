class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int open=0;

        for(char c:s.toCharArray())
        {
            if(c=='(' && open==0)
            {
                open++;
            } else if(c==')' && open==1)
            {
                open--;
            } else if(c=='(' && open>0)
            {
                ans.append(c);
                open++;
            } else if(c==')' && open>1)
            {
                ans.append(c);
                open--;
            }
        }
        return ans.toString();
    }
}
