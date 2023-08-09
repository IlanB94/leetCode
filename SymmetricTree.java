	public static boolean isSymmetric(TreeNode root) {
		if(root == null) {
			return true;
		}
		return helper(root.left, root.right);
	}
	
	public static boolean helper(TreeNode leftNode, TreeNode rightNode) {
		if(leftNode == null & rightNode == null) {
			return true;
		}
		if(leftNode == null || rightNode == null) {
			return false;
		}
		
		return leftNode.val == rightNode.val & helper(leftNode.left, rightNode.right) & helper(rightNode.left, leftNode.right);
	}
