public class CanSplit {
    public boolean canSplit(int arr[]) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int leftSum = totalSum;
        for (int i = arr.length - 1; i > -1; i--) {
            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                return true;
            }
            
            leftSum -= arr[i];
        }
        
        return false;
    }
}
