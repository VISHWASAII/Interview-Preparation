- It need to be balanced tree
- From root to left must be less
- And From root to right must be greater

## Insertion Logic
![[Pasted image 20250913175217.png]]
```
public static Node insertIntoTree(Node root, int data) {
    if (root == null) {
        return new Node(data);
    }
    if (data < root.data) {
        root.left = insertIntoTree(root.left, data);
    } else {
        root.right = insertIntoTree(root.right, data);
    }
    return root;
}

```
- The above code is insertion logic

```
import java.util.*;

public class Main{
    
    static class BinaryTree{
        Node root;
        
        static class Node{
            int data;
            Node left, right;
            Node(int val){
                this.data = val;
                this.left = null;
                this.right = null;
            }
        }
        
        BinaryTree(int val){
            root = new Node(val);
        }
        
        public static Node InsertIntoTree(Node root, int val){
            
            if(root == null){
                return new Node(val);
            }
            if(val < root.data){
                root.left = InsertIntoTree(root.left, val);
            }else{
                root.right = InsertIntoTree(root.right, val);
            }
            return root;
        }
        
        public  void insertRight(Node root,int val){
            Node newNode = new Node(val);
            root.right = newNode;
        }
        
        public void insertLeft(Node root,int val){
            Node newNode = new Node(val);
            root.left = newNode;
        }
        
        public static void preOrder(Node root){
            if(root != null){
            preOrder(root.left);
             System.out.println(root.data);
            preOrder(root.right);
            }
        }
    }
    public static void main(String[] args){
        BinaryTree value = new BinaryTree(10);
        value.insertRight(value.root, 11);
        value.insertLeft(value.root, 9);
        value.InsertIntoTree(value.root, 12);
        value.InsertIntoTree(value.root, 8);
        value.preOrder(value.root);
    }
}

//Overall Tree logic And the Node class must be static
```

## Search Method logic

- The snippet is used to check weather the value is found or no
```
       public Node search(Node root, int val){
            
            if(root == null || root.data == val){
                return root;
            }
            if(val < root.data){
               return search(root.left, val);
            }
               return search(root.right, val);
        }
```

