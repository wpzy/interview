package aimoffer;

import java.util.Stack;

public class TreeMethod {
	//渣比写法
	public static void preOrder_zhabi(TreeNode root){
		if(root!=null){
			System.out.println(root.value);
		}
		if(root.left!=null && root!=null){
			preOrder_zhabi(root.left);
		}
		if(root.right!=null && root!=null){
			preOrder_zhabi(root.right);
		}
		
	}
	
	
	public static void preOrder(TreeNode root){
		if (root!=null){
			System.out.println(root.value);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	
	
	public static void inOrder(TreeNode root){
		if(root!=null){
			inOrder(root.left);
			System.out.println(root.value);
			inOrder(root.right);
		}
	}
	
	
	public static void afterOrder(TreeNode root){
		if(root!=null){
			afterOrder(root.left);
			afterOrder(root.right);
			System.out.println(root.value);
		}
	}
	
	
	//用栈实现先序遍历
	public static void preOrderStack(TreeNode root){
		if(root==null){
			return;
		}
		
		Stack<TreeNode> s=new Stack<TreeNode>();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
