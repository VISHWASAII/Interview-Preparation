## Insert Binary Tree

```
class Solution {

    public TreeNode invertTree(TreeNode root) {

  

        if(root == null) return root;

        TreeNode left = invertTree(root.left);

        TreeNode right = invertTree(root.right);

  

        root.right = left;

        root.left = right;

  

        return root;

    }

}
```

## Minimum Depth of binary tree
```
class Solution {

    public int minDepth(TreeNode root) {

        if (root == null) return 0;

        return min_width(root);

    }

  

    private int min_width(TreeNode root) {

        if (root == null) return Integer.MAX_VALUE;

        if (root.left == null && root.right == null) return 1;

  

        int leftDepth = min_width(root.left);

        int rightDepth = min_width(root.right);

  

        return Math.min(leftDepth, rightDepth) + 1;

    }

}
```




## Width of the tree (Most important)

```

class Solution {

    int max_width;

    HashMap<Integer, Integer> leftmost_pos;

    public int widthOfBinaryTree(TreeNode root) {

        max_width = 0;

        leftmost_pos = new HashMap();

        get_width(root, 0, 0);

        return max_width;

    }

  

    private void get_width(TreeNode root, int depth, int pos){

        if(root == null) return;

        leftmost_pos.computeIfAbsent(depth, x->pos);

        max_width = Math.max(max_width, pos - leftmost_pos.get(depth) + 1);

        get_width(root.left, depth + 1, pos * 2);

        get_width(root.right, depth + 1, pos * 2 + 1);

    }

}
```

## Same Tree
- Its just a simple logic in the last return
```
    public boolean isSameTree(TreeNode p, TreeNode q) {

  

        if(p == null && q == null) return true;

        if(p == null || q == null) return false;

        if(p.val != q.val) return false;

  

        boolean left = isSameTree(p.left, q.left);

        boolean right = isSameTree(p.right, q.right);

  

        return left && right;

    }

}

```

## Sub tree of Another tree

- We need to use the same method used in the same tree here and also we need to send value one by one

- We are just pushing the value and popping out simply
```
class Solution {

  

    public boolean isSametree(TreeNode p,  TreeNode q){

        if(p == null && q == null) return true;

        if(p == null || q == null) return false;

        if(p.val != q.val) return false;

  

        boolean left = isSametree(p.left, q.left);

        boolean right = isSametree(p.right, q.right);

  

        return left && right;

    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root == null && subRoot == null) return true;

        if(root == null || subRoot == null) return false;

  

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

  

        while(!queue.isEmpty()){

  

            TreeNode tempNode = queue.poll();

  

            if(isSametree(tempNode, subRoot)){

                return true;

            }

  

            if(tempNode.left != null){

                queue.add(tempNode.left);

            }

  

            if(tempNode.right != null){

                queue.add(tempNode.right);

            }

        }

        return false;

    }

}
```