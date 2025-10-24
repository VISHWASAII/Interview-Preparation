- Graph Matrix
```
public class Main{
    public static void main(String[] args){
        
        //This is how we are rep the adjentcency matrix
        int[][] graph = {
            {0,1,0,0,1},
            {0,1,0,0,1},
            {0,1,0,0,1},
            {0,1,0,0,1}
        };
        
    }
}
```

- Graph List
- Vertices represent the nodes of the graph
```
import java.util.*;

public class Main{
    
    static class Graph{
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        Graph(int v){
            for(int i=0; i<v; i++){
                //In the list we are adding the List
                adjList.add(new ArrayList<Integer>());
            }
        }
        public void addEdge(int u, int v){
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        
        public void printAdjList(){
            for(int i=0; i<adjList.size(); i++){
                //i Represent Vertex
                System.out.println("Adj List idx" +i);
                for(int j=0; j<adjList.get(i).size(); j++){
                     System.out.println(" " + adjList.get(i).get(j));
                }
            }
        }
        
    }
    public static void main(String[] args){
        
        
        //Adding Nodes
        Graph graph  = new Graph(5);
        
        //Adding values in the edge of two vertices
        graph.addEdge(0,1);
        graph.addEdge(2,3);
        graph.addEdge(1,2);
        graph.addEdge(3,4);
        graph.addEdge(0,4);
        graph.addEdge(1,4);
        
        graph.printAdjList();
    }
}
```


### Breadth first Search
![[Pasted image 20250922132130.png]]


- First we need to take one vertices then we are going one by one
- We need to set visited Array 
- Then we need to add the Queue which will deleted visited node
![[Pasted image 20250922164648.png]]
- Before going into the queue first we need to check whether it is already there or not.
## Uses 
- Path finding
- Short difference
- Syntax for breath first search
```
//Starting vertex
        public void bfs(int v){
            int vertex_size = adjList.size();
          boolean[] visited = new boolean[vertex_size];

            
            //Here is the index where passed number or vertices
            visited[v] = true;
            
            Queue<Integer> q = new LinkedList<>();
            
            //Adding the ath value
            q.add(v);
            
            while(q.size() != 0){
                //dequeue will remove head element
                
                //Head value
                int vertex = q.remove();
                
                System.out.println("Vertex" + vertex);
                
                for(int i=0; i<adjList.get(vertex).size(); i++){
                   
                  int av = adjList.get(vertex).get(i);
                  
                  //Get the according values and put
                  if(!visited[av]){
                      q.add(av);
                      visited[av] = true;
                  }
                }
            }
```

## Depth First - Search

- it is key digging
- we are not explore entire level
- Just visit all child with the sub child

![[Pasted image 20250922172236.png]]

- Once we reach the dead end we need to do recursive call and reach to b then travel other 2
- where ever we go we can go until the dead end comes
- So we can use the stack data structure

## Steps 
- we need to use the recursion
- then we need to have the bool array to check whether it is visited or not
![[Pasted image 20250922180540.png]]

- Still 2 left all calls done so, we need to do the backtrack
- And marked will false so it will move to another variable

i need to master graph data structure means provide all importand like if i study this ill clear any graph problems like wise give question