package BasicLinkedList;

public class LinkedList {

    Node head;
    Node tail;
    int size;

    LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    void addNode (Node newNode) {
        if (tail == null) {
            head = newNode;
            tail = newNode;
            size = 1;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }
    void printLinkedLists(){
        Node current = head;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
    void removeLastNode(){
        if(head == null){
            System.out.println("List is empty");
        }
        else if (head == tail){
            head = null;
            tail = null;
        }
        else{
            Node current = head;
            while(current.next != tail){
                current = current.next;
            }
            current.next = null;
            tail = current;
        }
    }
    void removeFirstNode(){
        if(head == null){
            System.out.println("List is empty");
        }
        else if (head == tail){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
        }
    }
    void removeNode(int index){
        if(head == null){
            System.out.println("List is empty");
        }
        else if (head == tail){
            if(index == 0){
                head = null;
                tail = null;
            }
            else{
                System.out.println("Index is not found");
            }
        }else if(index > size){
            System.out.println("Index is out of bounds");
        }
        else if(index == 0){
            head = head.next;
        }
        else{
            Node current = head;
            int counter = 0;
            while(counter != index - 1){
                current = current.next;
                counter++;
            }
            current.next = current.next.next;
        }
    }
}
