class node{
    int data;
    node next;
    node prev;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    node head,tail;
    void insertFirst(int num){
        node newNode = new node(num);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }
    }
    void insertLast(int num){
        node newNode=new node(num);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    void insertposi(int num,int p){
        node newNode=new node(num);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            node fr = head;
            node bk;
            for(int i=0;i<p-2;i++)
                fr=fr.next;
            bk = fr.next;
            bk.prev = newNode;
            newNode.next = bk;
            newNode.prev = fr;
            fr.next = newNode;
        }
    }
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void displayrev(){
        node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
}
    
public class Main
{
	public static void main(String[] args) {
	    LinkedList ll=new LinkedList();
		ll.insertLast(10);
		ll.insertFirst(20);
		ll.insertLast(30);
		ll.insertFirst(40);
		ll.insertLast(50);
		ll.insertposi(60,3);
		ll.display();
		ll.displayrev();
	}
}

