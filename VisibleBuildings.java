public class VisibleBuildings {
    public int visibleBuildings(int arr[]) {
        int maxHeight = 0;
        int count = 0;
        
        for (int height : arr) {
            if (height >= maxHeight) {
                count++;
                maxHeight = height;
            }
        }
        
        return count;
    }
}
