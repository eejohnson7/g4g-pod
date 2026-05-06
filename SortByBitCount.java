import java.util.ArrayList;
import java.util.Comparator;

public class SortByBitCount {
    ArrayList<Integer> sortBySetBitCount(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int a : arr) {
            result.add(a);
        }
        
        result.sort(Comparator.comparingInt(Integer::bitCount).reversed());
        
        return result;
    }
}
