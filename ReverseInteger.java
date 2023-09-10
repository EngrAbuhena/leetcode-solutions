class Solution {
    public int reverse(int num) {
        int range= (int) (Math.pow(2,31)-1);

        if (num>range || num<-range) return 0;

        else {
            // convert int to string
            String str = Integer.toString(num);

            // reverse the string
            String revStr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                revStr = revStr + str.charAt(i);
            }
            String numericStr = null;
            if (revStr.charAt(revStr.length() - 1) == '-') {
                numericStr = revStr.replaceAll("-", "");
            } else numericStr=revStr;
            // convert string to int
            long result = Long.parseLong(String.valueOf(numericStr));

            if (revStr.charAt(revStr.length() - 1) == '-') result=-result;

            if (result > range || result < -range) return 0;

            else return (int) result;
        }
    }
}
