import java.util.NoSuchElementException;
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
        System.out.println("null");
    }

    //Remove an Element
    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already empty");
        }

        int result = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        length--;
        return result;
    }

    public int first(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already empty!");
        }
        return front.data;
    }

    public int last(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already empty!");
        }
        return rear.data;
    }

    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(7);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.print();

        // queue.dequeue();
        // queue.dequeue();
        // queue.dequeue();
        // queue.dequeue();
        // queue.print();

        System.out.println(queue.first());
        System.out.println(queue.last());
    }
}