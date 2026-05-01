public class SmallestSubstring {
    public int smallestSubstring(String s) {
        int[] freqs = new int[3];
        int left = 0;
        int n = s.length();
        int minLen = Integer.MAX_VALUE;
        int have = 0;
        
        for (int right = left; right < n; right++) {
            int rightChar = s.charAt(right) - '0';
            if (freqs[rightChar] == 0) {
                have++;
            }
            freqs[rightChar]++;
            
            while (have == 3) {
                minLen = Math.min(minLen, right - left + 1);
                
                int leftChar = s.charAt(left) - '0';
                freqs[leftChar]--;
                
                if (freqs[leftChar] == 0) {
                    have--;
                }
                
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}
