class Node
{
    int data;
    Node left, right;
}

public class CountTreeLeaves {
    int countLeaves(Node node) { 
        if (node.left == null && node.right == null) {
            return 1;
        }
        
        if (node.left == null) {
            return countLeaves(node.right);
        }
        
        if (node.right == null) {
            return countLeaves(node.left);
        }
        
        return countLeaves(node.left) + countLeaves(node.right);
    }
}
