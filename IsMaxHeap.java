public class IsMaxHeap {
    public boolean isMaxHeap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int parent = arr[i];
            int leftChildIndex = 2 * i + 1;
            int rightChildIndex = 2 * i + 2;
            
            if (leftChildIndex < arr.length && parent < arr[leftChildIndex]) {
                return false;
            }
            
            if (rightChildIndex < arr.length && parent < arr[rightChildIndex]) {
                return false;
            }
        }
        
        return true;
    }
}
