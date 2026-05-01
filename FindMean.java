import java.util.ArrayList;

public class FindMean {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefixSums = new int[n];
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            prefixSums[i] = sum;
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];
            
            int prefixSum = prefixSums[right];
            if (left != 0) {
                prefixSum -= prefixSums[left - 1];
            }
            
            result.add(prefixSum / (right - left + 1));
        }
        
        
        return result;
    }
}
