public class Queue{
    private ListNode front;
    private ListNode rear;
    private int length;

    public Queue(){
        this.rear = null;
        this.front = null;
        this.length = 0;
    }

    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    //insert an element in a Queue (Enqueue)
    public void enqueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
        }else{
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    //To print the queue
    public void print(){
        if(isEmpty()){
            return;
        }
        ListNode current = front;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(7);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.print();
    }
}