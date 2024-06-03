class Solution {
    public String largestOddNumber(String num) {
        int lastOddIndex = -1;

        for (int i = num.length() - 1; i >= 0; i--) {
            char n = num.charAt(i);
            if (n % 2 != 0) {
                lastOddIndex = i;
                break;
            }
        }

        if (lastOddIndex == -1) {
            return ""; 
        }

        return num.substring(0, lastOddIndex + 1);
    }
}
