public class DoublyLinkedList{
    private ListNode head;
    private ListNode tail;
    private int length;
    
    public class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
        }
    }

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0; // Or head == null;
    }

    public int length(){
        return length;
    }

    //insertLast
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    //Display doublyLinked list nodes in forward direction
    public void displayForward(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next; // go to next forward
        }
        System.out.println("null");
    }

    //Backward direction
    public void displayBackward(){
        if(tail == null){
            return;
        }

        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.data + " -->");
            temp = temp.previous;  // go previous
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertLast(1);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.insertLast(25);

        dll.displayForward();
        dll.displayBackward();
    }
}