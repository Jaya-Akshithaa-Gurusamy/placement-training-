import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        this.next = null;
    }
}
class Queue{
    node head,tail;
    
    boolean isEmpty(){
        return (head == null);
    }
    
    void EnQue(int data){
        node nn = new node(data);
        if(isEmpty()){
            head = nn;
            tail = nn;
        }
        else{
            if(head.data < nn.data){
                nn.next = head;
                head = nn;
                return;
            }
            node temp = head;
            node temp1 = head.next;
            while(temp1 != null && temp1.data < nn.data){
                temp1 =temp1.next;
                temp =temp.next;
            }
            temp.next = nn;
            nn.next = temp1;
            if(temp1 == null){
                tail = nn;
            }
        }
        System.out.println(nn.data + " is EnQue.");
    }
    void DeQue(){
        if(!isEmpty()){
            System.out.println(head.data + " is DeQue.");
            head = head.next;
        }
    }
}
public class Main{
    public static void main(String[] args){
        Queue qu = new Queue();
        
        qu.EnQue(7);
        qu.EnQue(9);
        qu.EnQue(2);
        qu.EnQue(4);
        qu.EnQue(1);
        qu.EnQue(5);
        
        System.out.println();
        
        qu.DeQue();
        qu.DeQue();
        qu.DeQue();
        qu.DeQue();
        qu.DeQue();
        qu.DeQue();
    }
}
