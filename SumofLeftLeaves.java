 public static int sumOfLeftLeaves(TreeNode root) {
		if(root == null) {
			return 0;
		}
		if(isLeaf(root.left)) {
			return root.left.val + sumOfLeftLeaves(root.right);
		}else {
			return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
		}
		
	}
	
	public static boolean isLeaf(TreeNode root) {
		if(root != null && root.left == null && root.right == null) {
			return true;
		}
		return false;
	}
