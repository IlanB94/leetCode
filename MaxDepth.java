 public int maxDepth(TreeNode root) {
    if (root == null) {
			return 0;
		} else {
			int right = 1 + maxDepth(root.right);
			int left = 1 + maxDepth(root.left);
			return Math.max(right, left);
	}
}
