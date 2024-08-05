class Solution {
    public int reverse(int x) {
        
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        int sign = x >= 0 ? 1 : -1;
        x = Math.abs(x);

        int reversedNum = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            if (reversedNum > (max- digit) / 10) {
                return 0;
            }

            reversedNum = reversedNum * 10 + digit;
        }
        reversedNum *= sign;
        if (reversedNum < min || reversedNum > max) {
            return 0;
        }

        return reversedNum;
    }
}

