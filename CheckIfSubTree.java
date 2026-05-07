public class CheckIfSubTree {
    public boolean isSubTree(Node root1, Node root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        
        if (root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right)) {
            return true;
        }
        
        return isSubTree(root1.left, root2) || isSubTree(root1.right, root2);
    }
    
    private boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        
        if (root1 == null) {
            return false;
        }
        
        if (root2 == null) {
            return false;
        }
        
        if (root1.data == root2.data) {
            return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
        }
        
        return false;
    }
}
