![[Pasted image 20250912175850.png]]

## Binary Search Tree
- h - Root to longest Leaf
- If we maintain balanced Tree then it will be O(log n)
- 
![[Pasted image 20250913172700.png]]
## Creating a Tree

```
import java.util.*;

public class Main{
    
    static class BinaryTree{
        Node root;
        
        class Node {
            int data;
            Node left, right;
            Node(int data){
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
        
        BinaryTree(int d){
            root = new Node(d);
        }
        
        public void insertLeft(Node r, int val){
            Node newNode = new Node(val);
            r.left = newNode;
        }
        
          public void insertRight(Node r, int val){
            Node newNode = new Node(val);
            r.right = newNode;
        }
        
    }
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree(12);
        tree.insertLeft(tree.root, 5); //Root left
        tree.insertRight(tree.root, 10); //Root right
        tree.insertLeft(tree.root.left, 15); //root left of left
    }
}
```

- Tree Traversal = Pre order traversal , In order Traversal, Post order Traversal
- Pre order = Root left right
- In Order = left root right
- Post order = left right root

### Code for Traversal

```
  public static void preOrder(Node root){
            if(root != null) {
        System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
            }
        }
        
                
        public static void inOrder(Node root){
            if(root != null) {
            preOrder(root.left);  System.out.println(root.data);
            preOrder(root.right);
            }
        }
        
           public static void inOrder(Node root){
            if(root != null) {
            preOrder(root.left);  
            preOrder(root.right);
            System.out.println(root.data);
            }
        }
```