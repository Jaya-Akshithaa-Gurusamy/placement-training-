import java.util.Scanner;
class Node {
    char data;
    Node next;
    
    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node head;

    boolean isEmpty() {
        return (head == null);
    }

    void push(char ch) {
        Node nn = new Node(ch);
        nn.next = head;
        head = nn;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            head = head.next;
        }
    }

    char peek() {
        if (!isEmpty()) {
            return head.data;
        } else {
            return '\0'; 
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Stack st = new Stack();
        String s = a.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(' || ch == '<') {
                st.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')' || ch == '>') {
                char top = st.peek();
                if ((top == '(' && ch == ')') ||
                    (top == '[' && ch == ']') ||
                    (top == '{' && ch == '}') ||
                    (top == '<' && ch == '>')) {
                    st.pop();
                } else {
                    st.push(ch); 
                }
            }
        }

        if (st.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
