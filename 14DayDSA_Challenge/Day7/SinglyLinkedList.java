//Aswin's solution
public class SinglyLinkedList{
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print(" null ");
    }

    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(1);
        ListNode second = new ListNode(17);
        ListNode third = new ListNode(19);
        ListNode fourth = new ListNode(25);

        //now we have to connect the nodes to form a chain

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();
    }
}