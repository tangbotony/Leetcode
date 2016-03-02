package maximumdepthofbinarytree;
public class Solution {
	public int maxDepth(TreeNode root) 
	{
		if(root==null)
			return 0;
		else if(root.left==null && root.right==null)
			return 1;
		else{
			int left = maxDepth(root.left);
			int right = maxDepth(root.right);
			return 1+(left>right?left:right);
		}
	} 
}