public class SumXOR {
        public long sumXOR(int[] arr) {
        long result = 0;
        int n = arr.length;
    
        for (int bit = 0; bit < 32; bit++) {
            long count1 = 0;
    
            // Count how many numbers have this bit set
            for (int x : arr) {
                if ((x & (1 << bit)) != 0) {
                    count1++;
                }
            }
    
            long count0 = n - count1;
    
            // Contribution of this bit
            result += count1 * count0 * (1L << bit);
        }
    
        return result;
    }
}