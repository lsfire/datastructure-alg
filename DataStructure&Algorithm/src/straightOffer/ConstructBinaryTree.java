package straightOffer;
/**
 * 
 * @author lsfire
 *从前序遍历和中序遍历构建二叉树
 */
public class ConstructBinaryTree {
	public static BinaryTreeNode constructBinaryTree(int[] preOrder,int[] inOrder,int length){
		if(null == preOrder || null == inOrder || length <= 0){
			return null;
		}
		
		return constructCore(preOrder, inOrder, 0, length - 1, 0, length - 1);
		
	}
	
	public static BinaryTreeNode constructCore(int[] preOrder,int[] inorder,
			int preOrderStart,int preOrderEnd,
			int inOrderStart,int inOrderEnd){
		BinaryTreeNode root = new BinaryTreeNode(preOrder[preOrderStart]);
		 root.left = null;
		 root.right = null;
		 //叶节点
		 if(preOrderStart == preOrderEnd){
			 if((inOrderStart == inOrderEnd) 
					 &&(preOrder[preOrderStart] == inorder[inOrderStart])){
				 return root;
			 }else System.out.println("invalid input");
		 }
		 
		 int rootValue = preOrder[preOrderStart];
		 int inorderRootIndex = inOrderStart;
		 
		 for(int i = inOrderStart;inorder[i] != rootValue && i < inOrderEnd;i++){
			 inorderRootIndex++;
		 }
		 if(inorder[inorderRootIndex] != rootValue){
			 System.out.println("invalid input");
		 }
		 
		 int leftLength = inorderRootIndex - inOrderStart;
		 int rightLength = inOrderEnd - inorderRootIndex;
		 if(leftLength > 0){
			 root.left = constructCore(preOrder, inorder, preOrderStart + 1, preOrderStart + leftLength, inOrderStart, inorderRootIndex - 1);
		 }
		 if (leftLength < preOrderEnd - preOrderStart) {
			root.right = constructCore(preOrder, inorder, preOrderStart + leftLength + 1,
					preOrderEnd,inorderRootIndex + 1, inOrderEnd);
		}
		 return root;
	}
	
	public static void main(String[] args) {
		int[] preOrder = new int[]{1,2,4,7,3,5,6,8};
		int[] inOrder = new int[]{4,7,2,1,5,3,8,6};
		BinaryTreeNode root = constructBinaryTree(preOrder, inOrder, 8);
		visitPre(root);
		System.out.println();
		visitIn(root);
	}
	
	public static void visitPre(BinaryTreeNode node){
		System.out.print(node.val);
		if(null != node.left){
			visitPre(node.left);
		}
		if(null != node.right){
			visitPre(node.right);
		}
	}
	
	public static void visitIn(BinaryTreeNode node) {
		if(null == node){
			return;
		}
		if(null != node.left){
			visitIn(node.left);
		}
		System.out.print(node.val);
		if(null != node.right){
			visitIn(node.right);
		}
		
	}

}

class BinaryTreeNode{
	int val;
	BinaryTreeNode left;
	BinaryTreeNode right;
	public BinaryTreeNode(int val) {
		// TODO Auto-generated constructor stub
		this.val = val;
	}
	
}
