public class Main{
    public static void main(String[] args){
        Node head = new Node(10);
        Node node_1 = new Node(20);
        Node node_2 = new Node(30);
        Node node_3 = new Node(40);
        head.next = node_1;
        node1.next = node_2;
        node2.next = node_3;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        this.head = null;
    }
    void insertBeg(int data){
        Node newNode = newNode(data);
        newNode.next = head;
        head = newNode;
    }
    void insertEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        var temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
}
    void insertPos(int data,int pos){
        Node newNode = new Node(data);
        var length = 0;
        var temp = head;
        while(temp != null){
            length = length + 1;
            temp = temp.next;
        }
        if(pos>=0 && pos<=length){
            if(pos == 0)
               insertBeg(data);
            else if(pos == length)
                insertEnd(data);
            else{
                temp = head;
                for(int i = 1; i < pos; i++){
                    temp=temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }else {
            System.out.println("The pos is in valid");
        }
    }
