import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Queue{
    Node head,tail;
    boolean isEmpty(){
        return (head == null);
    }
    void EnQue(int num){
        Node nn = new Node(num);
        if(head == null){
            head = nn;
            tail = nn;
        }
        else{
            if(head.data > nn.data){
                nn.next = head;
                head = nn;
                return ;
            }
            Node temp = head;
            Node temp1 = head.next;
            while(temp1 != null && temp1.data < nn.data){
                temp1 = temp1.next;
                temp = temp.next;
            }
            temp.next = nn;
            nn.next = temp1;
            if(temp1 == null){
                tail = nn;
            }
        }
        System.out.println(nn.data + " is EnQue");
    }
    void DeQue(){
        if(!isEmpty()){
            System.out.println(head.data + " is DeQue");
            head = head.next;
        }
    }
}
public class Main
{
    public static void main(String[] args) {
        Queue qu = new Queue();
        qu.EnQue(8);
        qu.EnQue(2); 
        qu.EnQue(4); 
        qu.EnQue(7); 
        qu.EnQue(3);
        
        System.out.println();
        
        qu.DeQue();
        qu.DeQue();
        qu.DeQue();
        qu.DeQue();
        qu.DeQue();
	}
}
