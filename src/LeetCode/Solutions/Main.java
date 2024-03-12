package LeetCode.Solutions;

public class Main {
    public static  void main(String args[])
    {
        LinkedList list =  new LinkedList(4);
        list.append(5);
        System.out.println("removed "+list.removeLast().value);
        System.out.println("removed "+list.removeLast().value);
        System.out.println("removed "+list.removeLast());
        System.out.println("Linked List ");
        list.printList();
    }
}
