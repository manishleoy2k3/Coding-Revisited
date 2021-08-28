package hackerrank.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class HeightOfBinaryTree {

	/* Iterative approach to find height of tree-level order traversal */
	public int findHeightOfBinaryTreeIterative(Node root) {
		Node temp;
		int height = 0;
		Queue<Node> queue = new ArrayDeque<>();
		queue.add(root);
		Node dummy = new Node(Integer.MIN_VALUE);
		queue.add(dummy);
		while (!queue.isEmpty()) {
			temp = queue.remove();
			if (temp.data == Integer.MIN_VALUE) {
				height++; // Increment height
				/*
				 * Insert special node queue if queue is not empty since all
				 * nodes of that level has been covered
				 */
				if (!queue.isEmpty())
					queue.add(dummy);
			}
			Node lc = temp.leftChild;
			Node rc = temp.rightChild;
			if (lc != null) {
				queue.add(lc);
			}
			if (rc != null) {
				queue.add(rc);
			}

		}
		return height;
	}

	/* Recursive approach to find height of binary tree */
	public int findHeightOfBinaryTreeRecursive(Node root) {
		if (root == null) {
			return 0;
		}
		/*
		 * Call function recursively for left and right child and find height of
		 * left and right child
		 */
		int lh = findHeightOfBinaryTreeRecursive(root.leftChild);
		int rh = findHeightOfBinaryTreeRecursive(root.rightChild);
		/* Check for length of left and right subtree height */
		if (rh > lh) {
			return 1 + rh;
		} else {
			return 1 + lh;
		}
	}

	public static void main(String[] args) {
		HeightOfBinaryTree heObj = new HeightOfBinaryTree();
		Node root = heObj.new BinaryTree().createTree();
		int size = heObj.findHeightOfBinaryTreeIterative(root);
		System.out.println("Iterative-  size of binary tree :- " + size);

		size = heObj.findHeightOfBinaryTreeRecursive(root);
		System.out.println("Recursive- size of binary tree :-  " + size);

	}

	class Node {
		private int data;
		private Node leftChild;
		private Node rightChild;

		public Node(int data) {
			this.data = data;
			leftChild = null;
			rightChild = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getLeftChild() {
			return leftChild;
		}

		public void setLeftChild(Node leftChild) {
			this.leftChild = leftChild;
		}

		public Node getRightChild() {
			return rightChild;
		}

		public void setRightChild(Node rightChild) {
			this.rightChild = rightChild;
		}
	}

	class BinaryTree {
		Node root;

		public BinaryTree() {
			root = null;
		}

		public Node createTree() {
			if (root == null) {
				root = new Node(3);
			}
			root.setLeftChild(new Node(2));
			root.setRightChild(new Node(5));
			root.getLeftChild().setLeftChild(new Node(1));
			root.getRightChild().setLeftChild(new Node(4));
			root.getRightChild().setRightChild(new Node(6));
			//root.getRightChild().setLeftChild(new Node(12));
			//root.getLeftChild().getLeftChild().setLeftChild(new Node(56));
			//root.getLeftChild().getLeftChild().setRightChild(new Node(78));
			//root.getLeftChild().getLeftChild().getRightChild().setLeftChild(new Node(78));
			root.getRightChild().getRightChild().setRightChild(new Node(7));
			//root.getRightChild().getLeftChild().setLeftChild(new Node(32));
			return root;
		}
	}
}
