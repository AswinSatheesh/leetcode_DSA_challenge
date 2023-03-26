//Asiwn's solution

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
    //To display the Singly linked list
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print(" null ");
    }

    //To find the length of Singly linked list
    public int length(){
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    //To insert newnode at the beginning of the singly linked list
    public void insertAtFirst(int newvalue){
        ListNode newNode = new ListNode(newvalue);
        newNode.next = head;
        head = newNode;
    } 

    //insert a node at the end of a singly linked list
    public void InsertAtLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current =  head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    //delete last node of a singly linked list
    public ListNode deleteLast(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        
        while(current.next != null){
            previous = current;
            current = current.next;
        }

        previous.next = null;
        return current;

    }

    //delete a node from a sigly linked list
    public void delete(int position){
        if(position == 1){
            head = head.next;
        }else{
            ListNode previous = head;
            int count =1;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    //search an element in a linked list
    public boolean find(int searchKey){
        if(head == null){
            return false;
        }
        ListNode current = head;
        while(current != null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args){
        SinglyLinkedList obj = new SinglyLinkedList();
        // obj.head = new ListNode(10);
        // ListNode second = new ListNode(20);
        // ListNode third = new ListNode(30);
        // ListNode four = new ListNode(60);
        // ListNode five = new ListNode(67);


        // obj.head.next = second;
        // second.next = third;
        // third.next = four;
        // four.next = five;

        // obj.insertAtFirst(99);

        // obj.display();
        // System.out.println();
        // System.out.println("Length of the singlyliked list is : " + obj.length());

        obj.InsertAtLast(1);
        obj.InsertAtLast(8);
        obj.InsertAtLast(11);
        // obj.display();


        // obj.deleteLast();
        // obj.deleteLast();
        // obj.deleteLast();

        obj.display();
        System.out.println();

        // obj.delete(3);
        // obj.display();

        if(obj.find(11)){
            System.out.println("Search key found!!");
        }else{
            System.out.println("Search key not found!");
  
        }


    }
}