class node{
    int data;
    node left;
    node right;
    node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BST{
    node root;
    void ins(int data){
        root = insert(root,data);
    }
    node insert(node root , int num){
        if(root == null){
            root = new node(num);
            return root;
        }
        if(root.data > num){
            root.left = insert(root.left,num);
        }
        else if(root.data < num){
            root.right = insert(root.right,num);
        }
        return root;
    }
    void display(){
        indisplay(root);
        System.out.println();
        predisplay(root);
        System.out.println();
        postdisplay(root);
        System.out.println();
        minvalue(root);
        System.out.println();
        maxvalue(root);
    }
    void indisplay(node root){
        if(root != null){
            indisplay(root.left);
            System.out.print(root.data+" ");
            indisplay(root.right);
        }
    }
    void predisplay(node root){
       if(root != null){
            System.out.print(root.data+" ") ;
            predisplay(root.left);
            predisplay(root.right);
       }
    }
    void postdisplay(node root){
        if(root != null){
            postdisplay(root.left);
            postdisplay(root.right);
            System.out.print(root.data+" ");
        }
    }
    void minvalue(node root){
        if(root == null) {
            System.out.print("The tree is empty");
            return;
        }
        else{
            if(root.left == null){
                System.out.print(root.data+" is the minimum value");
                return ;
            }
            else{
                minvalue(root.left);
            }
        }
    }
    void maxvalue(node root){
        if(root == null) {
            System.out.print("The tree is empty");
            return;
        }
        else{
            if(root.right == null){
                System.out.print(root.data+" is the maximum value");
                return ;
            }
            else{
                maxvalue(root.right);
            }
        }
    }
}
public class Main{
    public static void main(String[] args){
        BST bst = new BST();
        
        bst.ins(50);
        bst.ins(19);
        bst.ins(6);
        bst.ins(25);
        bst.ins(34);
        bst.ins(54);
        bst.ins(88);
        bst.ins(91);
        bst.ins(75);
        
        bst.display();
    }
}
