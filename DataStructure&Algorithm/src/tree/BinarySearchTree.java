package tree;
//the datastructure of BinarySearchTree
public class BinarySearchTree<T extends Comparable<? super T>> {
	private BinaryNode<T> root;//the root of the binary tree
	
	public BinarySearchTree() {
		root = null;
	}
	
	public void makeEmpty(){
		root = null;
	}
	
	public boolean contains(T element){
		return contains(element, root);
	}
	
	public boolean isEmpty(){
		return root == null;
	}
	
	public T findMin(){
		if(isEmpty()){
			return null;
		}
		return findMin(root).element;
	}
	
	public T findMax(){
		if(isEmpty()){
			return null;
		}
		return findMax(root).element;
	}
	
	public void insert(T element){
		root = insert(element, root);
	}
	
	public void remove(T element){
		root = remove(element, root);
	}
	
	public void printTree(){
		
	}
	
	private boolean contains(T element,BinaryNode<T> t){
		if(null == t){
			return false;
		}
		
		int comResult = element.compareTo(t.element);
		
		if(comResult < 0){
			return contains(element, t.left);
		}else if(comResult > 0){
			return contains(element,t.right);
		}
		return true;
	}
	
	private BinaryNode<T> findMin(BinaryNode<T> t){
		if(t == null || t.left == null){
			return t;
		}
		return findMin(t.left);
	}
	
	private BinaryNode<T> findMax(BinaryNode<T> t){
		while(t!= null){
			t = t.right;
		}
		return t;
	}
	
	private BinaryNode<T> remove(T element,BinaryNode<T> t){
		if(null == t){
			return t;
		}
		
		int comResult = element.compareTo(t.element);
		if(comResult < 0){
			t.left = remove(element, t.left);
		}
		else if(comResult > 0){
			t.right = remove(element, t.right);
		}else if(t.left != null && t.right != null){
			t.element = findMin(t.right).element;
			t.right = remove(element, t.right);
		}else {
			t = (t.left != null) ? t.left:t.right; 
		}
		return t;
	}
	//对于这个递归返回值的理解，插入一个节点必然会生成一个节点，
	//递归只是找到这个节点插入的位置
	private BinaryNode<T> insert(T element,BinaryNode<T> t){
		if(null == t){
			return new BinaryNode<T>(element, null, null);
		}
		
		int comResu = element.compareTo(t.element);
		
		if(comResu < 0){
			t.left = insert(element, t.left);
		}else if(comResu > 0){
			t.right = insert(element, t.right);
		}else 
			;
		return t;
	}
	
	private void printTree(BinaryNode<T> t){
		
	}
	
}

class BinaryNode<T>{
	T element;
	BinaryNode<T> left;
	BinaryNode<T> right;
	//constructor
	public BinaryNode(T element){
		this(element, null, null);
	}
	
	public BinaryNode(T element,BinaryNode<T> left,BinaryNode<T> right){
		this.element = element;
		this.left = left;
		this.right = right;
	}
	
}