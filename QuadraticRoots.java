import java.util.ArrayList;
import java.util.Collections;

public class QuadraticRoots {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> roots = new ArrayList<>();
        
        int discriminant = (b * b) - (4 * a * c);
        if (discriminant < 0) {
            roots.add(-1);
            return roots;
        }
        
        double sqrt = Math.sqrt(discriminant);
        
        if (sqrt == 0) {
            double root = (double) -b / (2 * a);
            int floor = (int) Math.floor(root);
            
            roots.add(floor);
            roots.add(floor);
            return roots;
        }
        
        double root1 = (double) (-b + sqrt) / (2 * a);
        double root2 = (double) (-b - sqrt) / (2 * a);
        
        roots.add((int) Math.floor(root1));
        roots.add((int) Math.floor(root2));
        Collections.sort(roots, Collections.reverseOrder());
        
        return roots;
    }    
}
