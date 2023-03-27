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

    //To display singlylinked list with given head
    public void displayWithHead(ListNode newhead){
        ListNode current = newhead;
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

    //To reverse a singly linked list
    public ListNode reverse(){
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    //FInd the middle node in a singly linked list- for that create one slowptr and fastptr - solowptr jumb one and fastptr jumb 2 , once fast ptr reach null slowptr will be middle.
    public ListNode getMiddleNode(){
        if(head == null){
            return null;
        }
        ListNode slowptr = head;
        ListNode fastptr = head;

        while(fastptr != null && fastptr.next != null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }

        return slowptr;
    }

    //find the nth node from the end of a linked list
    public ListNode getNthNodeFromEnd(int n){
        if(head == null){
            return null;
        }
        if(n <= 0){
            throw new IllegalArgumentException("Invalid value : n = " + n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;

        int count = 0;

        while(count < n){
            if(refPtr == null){
                throw new IllegalArgumentException(n + "is greater than the number of nodes in list");
            }
            refPtr = refPtr.next;
            count++;
        }

        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    //To remove duplicates from sorted linked list
    public void removeDuplicates(){
        if(head == null){
            return ;
        }
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
    }

    //Insert a node in a sorted singly linked list
    public ListNode insertInSortedList(int value){
        ListNode newnode = new ListNode(value);
        if(head == null){
            return newnode;
        }
        ListNode temp = null;
        ListNode current = head;

        while(current != null && current.data < newnode.data){
            temp = current;
            current = current.next;
        }

        temp.next = newnode;
        newnode.next = current;
        return head;
    }

    //remove a given key or node from singly linked list
    public void deleteNode(int key){
        ListNode current = head;
        ListNode temp = null;
        if(current != null && current.data == key){
            head = head.next;
            return;
        }

        while(current != null && current.data != key){
            temp = current;
            current = current.next;
        }

        temp.next = current.next;
    }


    //Creating a Loop in a linked list
    public void CreateALoopInLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4); 
        ListNode fifth = new ListNode(5);
        ListNode six = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = third; // connecting last node to the third element, making loop

    }

    //Detect a loop in a Linked List
    public boolean containsLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr == slowPtr){
                return true;
            }
        }
        return false;
    }

    //find start of loop in a singly linked list
    public ListNode startNodeInALoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr == slowPtr){
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }

    private ListNode getStartingNode(ListNode slowPtr){
        ListNode temp = head;
        while(temp != slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp; // starting node of the loop , This is the logic of Floyd's cycle detection Algorithm
    }

    //Remove loop from a Singly Linked List
    public ListNode removeLoopFromList(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr == slowPtr){
                removeLoop(slowPtr);
                break;     
            }
        }
        return head;
    }

    private void removeLoop(ListNode loopStart) { // remove the loop
        ListNode ptr1 = head;
        ListNode ptr2 = loopStart;
    
        while (ptr1.next != ptr2.next) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
 
        ptr2.next = null;
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

        // obj.InsertAtLast(1);
        // obj.InsertAtLast(8);
        // obj.InsertAtLast(10);
        // obj.InsertAtLast(16);
        // obj.InsertAtLast(30);
        // obj.display();


        // obj.deleteLast();
        // obj.deleteLast();
        // obj.deleteLast();

        // obj.display();
        // System.out.println();

        // obj.delete(3);
        // obj.display();

        // if(obj.find(11)){
        //     System.out.println("Search key found!!");
        // }else{
        //     System.out.println("Search key not found!");
  
        // }

        // ListNode reverseListHead = obj.reverse();
        // obj.displayWithHead(reverseListHead);

        // ListNode MiddileNode = obj.getMiddleNode();
        // System.out.println("Middle Node is : " + MiddileNode.data);

        // ListNode nthNodeFromEndResult = obj.getNthNodeFromEnd(2);
        // System.out.println("Nth node From end is : " + nthNodeFromEndResult.data);

        // obj.removeDuplicates();
        // obj.display();

        // obj.insertInSortedList(18);
        // obj.display();

        // obj.deleteNode(16);
        // obj.display();

        // obj.CreateALoopInLinkedList();
        // System.out.println(obj.containsLoop());

        // obj.CreateALoopInLinkedList();
        // System.out.println(obj.startNodeInALoop().data);

        obj.CreateALoopInLinkedList();
        ListNode newHead = obj.removeLoopFromList();
        obj.displayWithHead(newHead);
        

    }
}