public static List<Integer> inorderTraversal(TreeNode root) {
	    List<Integer> list = new ArrayList<>();
	    inorder(root, list);
	    return list;
}
	
public static void inorder(TreeNode root, List<Integer> list) {
	    if(root == null) {
	    	return;
	    }
	    inorder(root.left,list);
	    list.add(root.val);
	    inorder(root.right,list);
}
