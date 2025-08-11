class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BST{
    Node root;
    void ins(int num){
        root = insert(root,num);
    }
    Node insert(Node root,int num){
        if(root == null){
            root = new Node(num);
            return root;
        }
        if(root.data <  num){
            root.right = insert(root.right,num);
        }
        else if(root.data > num){
            root.left = insert(root.left,num);
        }
        return root;
    }
    void display(){
        indisplay(root);
        System.out.println();
        predisplay(root);
        System.out.println();
        postdisplay(root);
    }
    //inorder
    void indisplay(Node root){
        if(root != null){
            indisplay(root.left);
            System.out.print(root.data+" ");
            indisplay(root.right);
        }
    }
    //preorder
    void predisplay(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            predisplay(root.left);
            predisplay(root.right);
        }
    }
    //postorder
    void postdisplay(Node root){
        if(root != null){
            postdisplay(root.left);
            postdisplay(root.right);
            System.out.print(root.data+" ");
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		BST bst = new BST();
		
		bst.ins(61);
		bst.ins(92);
		bst.ins(34);
		bst.ins(48);
		bst.ins(54);
		bst.ins(75);
		bst.ins(19);
		bst.ins(6);
		bst.ins(25);
		bst.ins(88);
		
		bst.display();
	}
}
