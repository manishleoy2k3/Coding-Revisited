package hackerrank.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
*/

class BinarySearchTree{

	public static int getHeight(Node root){
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
			Node lc = temp.left;
			Node rc = temp.right;
			if (lc != null) {
				queue.add(lc);
			}
			if (rc != null) {
				queue.add(rc);
			}

		}
		return height-1;
    }
	//3, 5,	2, 1, 4, 6, 7
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    //print the nodes of same level together
    static void levelOrder(Node root){
    	Node curr = root;
    	Queue<Node> que = new LinkedList<Node>();
    	List<Integer> list = new ArrayList<Integer>();
    	
    	que.add(curr);
    	while(que.size() >0){
    		curr = que.remove();
    		list.add(curr.data);
    		if(curr.left != null){
    			que.add(curr.left);
    		}
    		if(curr.right != null){
    			que.add(curr.right);
    		}
    	}
    	for(int i=0; i<list.size(); i++){
    		System.out.print(list.get(i) + " ");
    	}
    }
    //3, 5, 4, 7, 2, 1
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        //int height=getHeight(root);
        //System.out.println(height);
        levelOrder(root);
    }
}
