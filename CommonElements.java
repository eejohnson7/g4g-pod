import java.util.ArrayList;

public class CommonElements {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        char shortestArr = getShortestArr(a, b, c);
        
        if (shortestArr == 'a') {
            return getCommonElements(b, c, a);
        } else if (shortestArr == 'b') {
            return getCommonElements(a, c, b);
        } else {
            return getCommonElements(a, b, c);
        }
    }
    
    private char getShortestArr(int[] a, int[] b, int[] c) {
        if (a.length < b.length && a.length < c.length) {
            return 'a';
        } else if (b.length < c.length) {
            return 'b';
        } else {
            return 'c';
        }
    }
    
    private ArrayList<Integer> getCommonElements(int[] a, int[] b, int[] shortest) {
        ArrayList<Integer> commonElements = new ArrayList<>();
        
        for (int i = 0; i < shortest.length; i++) {
            int c = shortest[i];
            
            if (i > 0 && c == shortest[i - 1]) {
                continue;
            }
            
            if (existsInArr(a, c) && existsInArr(b, c)) {
                commonElements.add(c);
            }
        }
        
        return commonElements;
    }
    
    private boolean existsInArr(int[] a, int c) {
        for (int i : a) {
            if (i == c) {
               return true;
            }
        }
        return false;
    }
}
