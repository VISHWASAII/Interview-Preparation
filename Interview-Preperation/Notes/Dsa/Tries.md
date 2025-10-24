- It is comes from retriever
- It is used for search operation
- It is also called prefix tree.
- It contains char
- Tries nodes of children 
- Boolean is a END word
`` it contains Three things 1) Val 2) Flag 3) child [Char array] ``

- Simple concept just undersand
``Temp = temp.next`` concept

```
class TrieNode{

    private boolean isWord;

    private char val;

    TrieNode[] childrens;

  

    private int TOTAL_NODE = 26;

  

    public TrieNode(){

        childrens = new TrieNode[TOTAL_NODE];

    }

    public TrieNode(char val){

        this.val = val;

        childrens = new TrieNode[TOTAL_NODE];

    }

    //Checking whether it is word or not

    public boolean isWord(){

        return isWord;

    }

  

    //Marking it is a word

    public void setWord(){

        this.isWord = true;

    }

    //Getting the Actual word

    public char getWord(){

        return this.val;

    }

  

    public void emptyTheChildNode(){

        this.childrens = new TrieNode[TOTAL_NODE];

    }

}

  
  

class Trie {

  

    TrieNode root = null;

  

    public Trie() {

        root = new TrieNode();

    }

    public void insert(String word) {

        TrieNode tempNode = root;

  

        for(int i=0; i<word.length(); i++){

            if(tempNode.childrens[word.charAt(i) - 'a'] == null){

                tempNode.childrens[word.charAt(i) - 'a'] = new TrieNode(word.charAt(i));

            }

            //Lets consider this as a Head node assign new node to the head

            tempNode = tempNode.childrens[word.charAt(i) - 'a'];

        }

        tempNode.setWord();

    }

    public boolean search(String word) {

        //Using temp we need to loop through it

  

        TrieNode tempNode = root;

  

        for(int i=0; i<word.length(); i++){

            if(tempNode.childrens[word.charAt(i) - 'a'] != null){

                tempNode = tempNode.childrens[word.charAt(i) - 'a'];

            }else{

                return false;

            }

        }

        return tempNode.isWord();

    }

    public boolean startsWith(String prefix) {

        TrieNode tempNode = root;

  

        for(int i=0; i< prefix.length(); i++){

             if(tempNode.childrens[prefix.charAt(i) - 'a'] != null){

                tempNode = tempNode.childrens[prefix.charAt(i) - 'a'];

            }else{

                return false;

            }

        }

  

        return true;

    }

}
```