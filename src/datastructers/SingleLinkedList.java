package datastructers;

public class SingleLinkedList {


    private Node head;
    private Node tail;
    private int size;

    public SingleLinkedList() {
    }
    public SingleLinkedList(int size) {
        this.size =0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = node;
        head = node;

        if(tail == null)
        {
            tail = head;
        }
        size++;

    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
