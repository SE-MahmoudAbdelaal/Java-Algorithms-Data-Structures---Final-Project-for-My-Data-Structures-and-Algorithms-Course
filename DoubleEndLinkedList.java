package my.project;
class Node {
    char value;
    Node next;
    Node previous;
Node(char value) {
        this.value = value;
}
}
class DoubleL {
    Node first = null;
    Node last = null;
public void add(int index, char value) {
        Node newNode = new Node(value);
        if (index == 0) {
            if (first == null) {
                newNode.next = first;
                first = newNode;
            }
            else {
                first.previous = newNode;
                newNode.next = first;
                first = newNode;
            }
            last = newNode;
        }
        else {
            Node i = first;
            for (int count = 0; count < index - 1; count++) {
                i = i.next;
            }
            if (i.next == null) {
                newNode.next = i.next;
                i.next = newNode;
                newNode.previous = i;
            }
            else {
                Node j = i.next;
                newNode.next = i.next;
                i.next = newNode;
                newNode.previous = j.previous;
                j.previous = newNode;
            }
        }
    }
public void delete(int index) {
        Node i = first;
        if (index == 0) {
            first.next.previous = null;
            first = first.next;
        }
        else {
            for (int count = 0; count < index - 1; count++) {
                i = i.next;
            }
            if (i.next.next == null) {
                
                i.next=i.next.next;
                last=i;
            }
            else {    
                i.next=i.next.next;
                i.next.previous=i.next.next.previous;
            }
        }
}
public void display() {
        Node i = first;
        while (i != null) {
            System.out.print(i.value + "  ");
            i = i.next;
        }
        System.out.println();
}
}
public class doubleendlinkedlist {
    public static void main(String[] args) {
        DoubleL dl = new DoubleL();
        dl.add(0, 'a');
        dl.add(1, 'b');
        dl.add(2, 'c');
        dl.add(3, 'd');
        dl.add(4, 'e');
        dl.display();
        dl.delete(0);
        dl.display();
    }
}