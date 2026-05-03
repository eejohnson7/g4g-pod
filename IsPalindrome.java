public class IsPalindrome {
    static long isPallindrome(long N) {
        String bin = Long.toBinaryString(N);
        int n = bin.length();

        String left = getLeftSubstring(bin, n);
        String right = bin.substring(Math.ceilDiv(n, 2));

        return left.equals(new StringBuilder(right).reverse().toString()) ? 1 : 0;
    }
    
    private static String getLeftSubstring(String bin, int n) {
        if (n % 2 == 0) {
            return bin.substring(0, n/2); 
        } else {
            return bin.substring(0, Math.ceilDiv(n, 2) - 1); 
        } 
    }
}
