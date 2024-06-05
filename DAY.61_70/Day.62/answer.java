class Solution {
    public boolean checkRecord(String s) {
        int absentCount = 0;
        int lateCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                absentCount++;
                if (absentCount >= 2)
                    return false; 
            }
            
            if (c == 'L') {
                lateCount++;
                if (lateCount >= 3 && i >= 2 && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L')
                    return false; 
            } else {
                lateCount = 0; 
            }
        }
        
        return true; 
    }
}
