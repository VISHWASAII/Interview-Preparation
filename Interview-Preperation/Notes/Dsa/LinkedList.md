- Singly linked List
```
import java.util.*;

public class Main{
    
    static class LinkedList{
        
        Node head;
            
          class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
       
       LinkedList(){
           head = null;
       }
       public void addElements(int data){
           Node newNode = new Node(data);
           if(head == null){
               head = newNode;
           }else{
               Node temp = head;
               head = newNode;
               head.next = temp;
           }
       }   
        
        public void display(){
           Node temp = head;
           while(temp != null){
               int data = temp.data;
               System.out.print(data + "->");
               temp = temp.next;
           }
        }
        
        public void reverseElements(){
            Node prev = null;
            Node curr = head;
            Node next;
            
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
    }
    
    public static void main(String[] args){
        LinkedList ll  = new LinkedList();
        
        ll.addElements(12);
        ll.addElements(13);
        ll.addElements(14);
        
        ll.display();
        
        ll.reverseElements();
        
        ll.display();
    }
}
```


- Doubly LinkedList
```
import java.util.*;

public class Main{
    
    static class DoublyLinkedList{
        Node head;
        Node tail;
        
        class Node{
            Node prev;
            int data;
            Node next;
            Node(int data){
                this.prev = null;
                this.data = data;
                this.next = null;
            }
        }
        
        DoublyLinkedList(){
            head = null;
        }
        
        public void insertAtBegining(int data){
          Node newNode = new Node(data);
          if(head == null){
              head = newNode;
              tail = newNode;
            //   tail.next = head;
            //   head.prev = tail;
          }else{
              head.prev = newNode;
              newNode.next = head;
              head = newNode;
          }
        }
        
        public void display(){
         Node temp = head;
         System.out.println("Printing Values in an list");
          while(temp != null){
              int data = temp.data;
              System.out.print(data + " - >");
              temp = temp.next;
          }
            System.out.println(" ");
        }
        
        public void displayReverse(){
            Node temp = tail;
            System.out.println("Printing Values in an list in reverse order");
            while(temp != null){
                int data = temp.data;
                System.out.print(data + " - >");
                temp = temp.prev;
            }
        }
        
        public void insertAtPos(int index, int value){
            Node newNode = new Node(value);
            Node temp = head;
            
          if (index == 0) { // insert at head
                newNode.next = head;
                if (head != null) {
                    head.prev = newNode;
                }
                head = newNode;
                return;
            }
            
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
            Node before = temp.prev;
            Node after = temp;
            
            newNode.prev = before;
            newNode.next = after;
            before.next = newNode;
            after.prev = newNode;
        }
        
        public void deleteAtPos(int index){
            Node temp = head;
            Node before;
            if(index == 0) {
               head = head.next;
               head.prev = null;
            }
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
            before = temp.prev;
            before.next = temp.next;
        }
}
    public static void main(String[] args){
        
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertAtBegining(12);
        dl.insertAtBegining(13);
        dl.insertAtBegining(14);
        
        dl.display();
        dl.displayReverse();
        
        dl.insertAtPos(1, 12);
        dl.display();
        
        dl.deleteAtPos(2);
        dl.display();
    }
}
```

- Circular linked List
```
import java.util.*;

public class Main{
    
    static class CircularLinkedList{
        
        Node head;
        Node tail;
            
          class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
       
       CircularLinkedList(){
           head = null;
       }
       public void addElements(int data){
           
           Node newNode = new Node(data);
           if(head == null){
               head = newNode;
               tail = newNode;
                tail.next = head;
           }else{
               Node temp = head;
               head = newNode;
               head.next = temp;
                tail.next = head;
           }
         
       }   
       public void insertAtBegining(int value){
           System.out.println("Inserted At begining");
           Node newNode = new Node(value);
           if(tail == null){
               tail = newNode;
               tail.next = tail;
           }
           newNode.next = tail.next;
           tail.next = newNode;
       }
       
       public void insertAtEnd(int value){
          System.out.println("Inserted At End");
           Node newNode = new Node(value);
            if(tail == null){
               tail = newNode;
               tail.next = tail;
           }
           newNode.next = tail.next;
           tail.next = newNode;
           tail = newNode;
           
       }
       
       public void display(){
           Node temp = tail.next;
           
           do{
               int value = temp.data;
               System.out.print(value + "-> ");
               temp = temp.next;
           }while(temp != tail.next);
       }
       
    }
    
    public static void main(String[] args){
        CircularLinkedList ll  = new CircularLinkedList();
        
        ll.addElements(12);
        ll.addElements(13);
        ll.addElements(14);
        
        ll.display();
        
        ll.insertAtBegining(10);
        ll.insertAtEnd(15);
        
        ll.display();
    }
}
```

Cycle detection using Floyd's cycle Finding algorithm:

- The tortoise and the rabbit meeting point would be the loop node or the multiple of loop node
- Two types of question 1- loop detection and then Finding loop starting point
```
/**

 * Definition for singly-linked list.

 * class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode(int x) {

 *         val = x;

 *         next = null;

 *     }

 * }

 */

public class Solution {

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;

        ListNode fast = head;

  

        while(fast != null && fast.next != null){

            slow = slow.next;

            fast = fast.next.next;

  

            if(slow == fast) return true;

        }

        return false;

    }

}
```

- Returning the starting node of the loop
- For this we need to put the slow into the start and make slow and fast as 1 move
```
/**

 * Definition for singly-linked list.

 * class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode(int x) {

 *         val = x;

 *         next = null;

 *     }

 * }

 */

public class Solution {

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;

        ListNode fast = head;

  

        while(fast != null && fast.next != null){

            slow = slow.next;

            fast = fast.next.next;

            if(slow == fast){

                slow = head;

                while(slow != fast){

                    slow = slow.next;

                    fast = fast.next;

                }

                return slow;

            }

        }

        return null;

    }

}
```
- Similarly i need to remove the link which it got before
