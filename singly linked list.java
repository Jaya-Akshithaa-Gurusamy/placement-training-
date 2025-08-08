class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    node head,tail;
    void insertFirst(int num){
        node newNode=new node(num);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    void insertMid(int num,int p){
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
            newNode.next = bk;
            fr.next = newNode;
        }
    }
    void insertLast(int num){
        node newNode=new node(num);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    void deleteFirst(){
        head = head.next;
    }
    void deleteEnd(){
        node temp = head;
        while(temp.next.next!=null)
            temp = temp.next;
        tail = temp;
        tail.next = null;
    }
    void deleteposi(int p){
        node fr = head;
        node bk;
        for(int i=0;i<p-2;i++)
            fr=fr.next;
        bk = fr.next;
        fr.next = bk.next;
    }
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class Main {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.insertLast(10);
		ll.insertLast(20);
		ll.insertFirst(30);
		ll.insertLast(40);
		ll.insertLast(50);
		ll.insertFirst(60);
		ll.insertMid(70,3);
		
		ll.deleteFirst();
		ll.deleteEnd();
		ll.deleteposi(3);
		
		ll.display();
	}
}
