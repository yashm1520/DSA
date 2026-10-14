package Tree;


public class FlattenBinaryTree {
	
	public class TreeNode {
		      int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode() {}
		     TreeNode(int val) { this.val = val; }
		     TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		     }
		 }
		 

public void flatten(TreeNode root) {
    TreeNode curr = root;

   while (curr != null) {

       if (curr.left != null) {

           TreeNode prev = curr.left;

           // Find the rightmost node of the left subtree
           while (prev.right != null) {
               prev = prev.right;
           }

           // Connect the original right subtree
           prev.right = curr.right;

           // Move the left subtree to the right
           curr.right = curr.left;
           curr.left = null;
       }

       curr = curr.right;
}}
}
