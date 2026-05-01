public class FindPosition {
    public int findPosition(int n) {
        String bin = new StringBuilder(Integer.toBinaryString(n)).reverse().toString();
        int[] freqs = new int[2];
        
        for (int i = 0; i < bin.length(); i++) {
            int c = bin.charAt(i) - '0';
            freqs[c]++;
            
            if (freqs[1] > 1) {
                return -1;
            }
        }
        
        return bin.indexOf('1') + 1;
    }
}
