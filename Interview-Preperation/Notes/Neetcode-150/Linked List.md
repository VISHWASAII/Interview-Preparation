## Merge two list
```
/**

 * Definition for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode() {}

 *     ListNode(int val) { this.val = val; }

 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

 * }

 */

class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode  tempNode = new ListNode(-1);

        ListNode curr = tempNode;

  

        while(list1 != null && list2 != null){

            if(list1.val <= list2.val){

                curr.next = list1;

                list1 = list1.next;

            }else{

                curr.next = list2;

                list2 = list2.next;

            }

            curr = curr.next;

        }

  

         if (list1 != null) {

            curr.next = list1;

        } else {

            curr.next = list2;

        }

  

        return tempNode.next;

  

    }

}
```

## Re order list
```
/**

 * Definition for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode() {}

 *     ListNode(int val) { this.val = val; }

 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

 * }

 */

class Solution {

    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;

        ListNode fast = head, slow = head;

  

        while(fast != null && fast.next != null){

            fast = fast.next.next;

            slow = slow.next;

        }

        ListNode second = reverseList(slow.next); //Second half

        slow.next = null;

  

        ListNode first = head;

        while(second != null){

            ListNode temp1 = first.next;

            ListNode temp2 = second.next;

  

            first.next = second;

            second.next = temp1;

  

            first = temp1;

            second = temp2;

        }

    }

     private static  ListNode reverseList(ListNode head){

        ListNode curr = head;

        ListNode prev = null;

        ListNode next;

  

        while(curr != null){

            next = curr.next;

            curr.next = prev;

  

            prev = curr;

            curr = next;

        }

        return prev;

    }

}
```

## Remove element from Nth end node
```
class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;

        ListNode slow = head;

  

        for(int i=0; i<n; i++){

            if(fast == null) return head;

            fast = fast.next;

        }

  

        if(fast == null){

            head = head.next;

            return head;

        }

  

        while(fast.next != null){

            fast = fast.next;

            slow = slow.next;

        }

  

        if(slow.next != null){

            slow.next = slow.next.next;

        }

        return head;

  

    }

}
```

## [Copy List with Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer/)
```
/*

// Definition for a Node.

class Node {

    int val;

    Node next;

    Node random;

  

    public Node(int val) {

        this.val = val;

        this.next = null;

        this.random = null;

    }

}

*/

  

class Solution {

    public Node copyRandomList(Node head) {

        Node curr = head;

        Node prev = null;

        Node res = null;

  

        HashMap<Node, Node> nodeMap = new HashMap<>();

        while(curr != null){

            Node newNode = new Node(curr.val);

            nodeMap.put(curr, newNode);

            if(prev == null) res = newNode;

            else{

                prev.next = newNode;

            }

            prev = newNode;

            curr = curr.next;

        }

  

        curr = head;

        Node temp = res;

  

        while(curr != null){

            temp.random = nodeMap.get(curr.random);

            temp = temp.next;

            curr = curr.next;

        }

  

        return res;

    }

}
```

## Add Two Number Solution

```
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

  

        ListNode temp = new ListNode(0);

        ListNode l3 = temp;

  

        int carry = 0;

        while(l1 != null || l2 != null){

            int first_ll = (l1 != null) ? l1.val : 0;

            int second_ll = (l2 != null) ? l2.val : 0;

  

            int curr_val = first_ll + second_ll + carry;

            carry = curr_val / 10;

            int last_digit = curr_val % 10;

  

            ListNode newNode = new ListNode(last_digit);

            l3.next = newNode;

  

            if(l1 != null) l1 = l1.next;

            if(l2 != null) l2 = l2.next;

            l3 = l3.next;

        }

        if(carry > 0){

            ListNode newNode = new ListNode(carry);

            l3.next = newNode;

            l3 = l3.next;

        }

  

        return temp.next;

    }

}
```

## Find the Duplicate Number
```
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                break;
            }
        }

        int slow2 = 0;
        while (true) {
            slow = nums[slow];
            slow2 = nums[slow2];
            if (slow == slow2) {
                return slow;
            }
        }
    }
}
```

## LRU Cache
```
class LRUCache {

  

    static Node head = new Node();

    static Node tail = new Node();

    HashMap<Integer, Node> node_map;

    int cache_capacity;

  

    public LRUCache(int capacity) {

        this.cache_capacity = capacity;

        node_map = new HashMap(capacity);

        head.next = tail;

        tail.prev = head;

    }

    public int get(int key) {

  

        int result = -1;

        Node node = node_map.get(key);

        if(node != null){

            result = node.val;

            remove(node);

            add(node);

        }

        return result;

    }

    public void put(int key, int value) {

        Node node = node_map.get(key);

        if(node != null){

            remove(node);

            node.val = value;

            add(node);

        }else{

            if(node_map.size() == cache_capacity){

                node_map.remove(tail.prev.key);

                remove(tail.prev);

            }

  

            Node new_node = new Node();

            new_node.key = key;

            new_node.val = value;

  

            node_map.put(key, new_node);

            add(new_node);

        }

    }

  

    public static void remove(Node node){

        Node next_node = node.next;

        Node prev_node = node.prev;

  

        next_node.prev = prev_node;

        prev_node.next = next_node;

    }

  

    public static void add(Node node){

        node.next = head.next;

        node.prev = head;

        if(head.next != null){

            head.next.prev = node;

        }

        head.next = node;

    }

  

    static class Node{

        int key;

        int val;

        Node prev;

        Node next;

    }

}
```

##  Merge K Sorted Lists - Explanation

```
/**

 * Definition for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode() {}

 *     ListNode(int val) { this.val = val; }

 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

 * }

 */

class Solution {

    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length == 0) return null;

  

          PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

          for(ListNode x: lists){

             if(x != null){

                minHeap.offer(x);

             }

          }

  

          ListNode res = new ListNode();

          ListNode curr = res;

  

          while(!minHeap.isEmpty()){

            ListNode node = minHeap.poll();

            curr.next = node;

            curr = curr.next;

  

            node = node.next;

            if(node != null){

                minHeap.offer(node);

            }

          }

  

          return res.next;

    }

}
```

## Reverse Nodes in K-Group