public static TreeNode invertTree(TreeNode root) {

		if (root == null) {
			return root;
		}
		
		if(root.right != null || root.left != null) {
			TreeNode right = invertTree(root.right);
			TreeNode left = invertTree(root.left);
			TreeNode temp = right;
			root.right = left;
			root.left = temp;
		}
		
		return root;
