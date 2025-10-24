- It is used To make the tree into an balanced tree by checking each time inserting
- Using Rotation we are balancing the tree
- #### before that we need to find the balance factor
- All code which is similar to tree but we are only using the Balance factor to balance the tree.
- ## Three method one for height, max and comparing
### Steps
- First we need to find the height of the tree. Max Height (h max = h(lc), h(rc)) + 1
```
            public static Node insertIntoTree(Node root, int data){
                if(root == null ){
                    return new Node(data);
                }
                if(root.data > data){
                    root.left = insertIntoTree(root.left, data);
                }else if(root.data< data){
                    root.right = insertIntoTree(root.right, data);
                }else{
                    return root;
                }
                
                
                //We need to Increment the root height by 1 
    
    //In the recursive call we are incre the size of tree by  1
     root.height = 1+max(getHeight(root.left), getHeight(root.right));
                
                return root;
            }
            
            public void inOrder(Node root){
                
                if(root != null){
                inOrder(root.left);
                System.out.println(root.data);
            System.out.println("Height" + root.height);
                inOrder(root.right);
                }
               
            }
            
            //Getting Just Height of the node
            public static int getHeight(Node node){
                if(node == null){
                    return -1;
                }
                return node.height;
            }
            
```

- Finding Balance Factor 

```
//Will be stored into the BalanceFactore which is said

int balFactor = getBalanceFactor(root);

// Left - right for the balance factor
             public static int getBalanceFactor(Node root){
               if(root == null){
                     return 0
                 }
                 return getHeight(root.left) - getHeight(root.right);
             }
```

## Condition for Checking Cases

```
	root.height = 1+max(getHeight(root.left), getHeight(root.right));

			int balFactor = getBalanceFactor(root);



        //LL case (val less left roor)
            if(balFactor> 1 && data < root.left.data){
                
            }
            
        //LR case (val greated then root.left)
        if(balFactor > 1 && data > root.left.data){
            
        }
        
        //RR case (val greated than root.right)
        
        if(balFactor<-1 && data > root.right.data){
            
        }
        
         //RL case (val Lesser than root.right)
        if(balFactor<-1 && data < root.right.data){
            
        }
```
- Just a Simple code Update we are solving the problem

![[Pasted image 20250921171938.png]]


## Simple Left and right rotate logic
```
	    public Node rightRotate(Node z){
	        Node y = z.left;
	        Node t3 = y.right;
	        
	        y.right = z;
	        z.left = t3;
	        
	        z.height = 1 + max(getHeight(z.left), getHeight(z.right));
	         y.height = 1 + max(getHeight(y.left), getHeight(y.right));
	         return y; //Returning the root which is y
	    }
	    
	    public Node leftRotate(Node z){
	        Node y = z.right;
	        Node t3 = y.left;
	        
	        y.right = z;
	        z.right = t3;
	        
    	        z.height = 1 + max(getHeight(z.left), getHeight(z.right));
     y.height = 1 + max(getHeight(y.left), getHeight(y.right));
     return y; //Returning the root which is y
	    }
```
- For the making Changes these steps are More important
```
   public static Node insertIntoTree(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertIntoTree(root.left, data);
        } else if(data > root.data) {
            root.right = insertIntoTree(root.right, data);
        }
        else{
            return root;
        }
       root.height = 1 + max(getHeight(root.left), getHeight(root.right));
       
       int balFactor = getBalanceFactor(root);
       if(balFactor > 1 && root.left.data > data){
           //LL
           return rightRotate(root);
       }
       if(balFactor > 1 && root.left.data < data){
           //LR
           node.left = leftRotate(root.left);
           return rightRotate(root);
           
       }
       if(balFactor < -1 && root.right.data < data){
           //RR
           return leftRotate(root);
       }
       if(balFactor < -1 && root.right.data > data){
           //RL
           node.right = rightRotate(root.right);
           return leftRotate(root);
       }
        return root;
    }
    
    public static node rightRotate(Node z){
        //Will be understand After watching the diagram
        Node y = z.left;
        Node  t3 = y.right;
        
        
        y.right = z;
        z.left = t3;
        
        //Updating the Height 
        z.height = 1 + max(getHeight(z.left), getHeight(z.right));
        y.height = 1 + max(getHeight(y.left), getHeight(y.right));
        
        return y;
        
    }
    public static int getBalanceFactor(Node node){
        if(node == null) return 0;
        return getHeight(node.left) - getHeight(node.right);
    }
    
    public static int getHeight(Node node){  
        if(node == null) return -1; //If node is no there 
        return node.height;
    }
    
    public static int max(int a, int b){
        return a>b ? a : b;
    }
```

From tree we need to find the left and right factor before updating
-  we need to update the root using the helper function

