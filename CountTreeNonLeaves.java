public class CountTreeNonLeaves {
    int countNonLeafNodes(Node root) { // 4, 4, 
        if (root == null) {
            return 0;
        }
        
        if (root.left != null || root.right != null) { // true
            return 1 + countNonLeafNodes(root.left) + countNonLeafNodes(root.right);
        }
        
        return 0;
    }
}
