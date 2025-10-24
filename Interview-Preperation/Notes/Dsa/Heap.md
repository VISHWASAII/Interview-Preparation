- Implementation of heap is so simple
- while adding we need to put that value int the root level in arrayList last
- if the parent which is getter than that then we need to swap until parent is 0
- while deleting we need to get first index 0- swap with last and remove last
- then we need to compare that in down manner
- This is the implementation

```
import java.util.ArrayList;  
  
public class Heap<T extends Comparable<T>>{  
  
    private ArrayList<T> list;  
  
    Heap(){  
       list =  new ArrayList<>();  
    }  
  
    private void swap(int first, int second){  
        T temp = list.get(first);  
        list.set(first, list.get(second));  
        list.set(second, temp);  
    }  
  
    private int parent(int index){  
        return (index -1) / 2; //Because we are taking index 0  
    }  
  
    private int left(int index){  
        return index * 2 + 1;  
    }  
  
    private int right(int index){  
        return index * 2 + 2;  
    }  
  
    public void insert(T value){  
        list.add(value);  
        upheap(list.size() - 1);  
    }  
  
    private void upheap(int index){  
        if(index == 0) return;  
        int p = parent(index);  
        if(list.get(index).compareTo(list.get(p)) < 0){  
            //If the current element lesser than parent swap  
            swap(index, p);  
            upheap(p);  
        }  
    }  
    private T remove() throws Exception{  
        if(list.isEmpty()) throw new Exception("List is empty");  
  
        T temp = list.get(0); //Only getting  
  
        T last = list.remove(list.size() - 1);//Here only removing becoz we can get null value  
        if(!list.isEmpty()){  
            list.set(0, last);  
            downheap(0);  
        }  
        return temp;  
    }  
    public void downheap(int index){  
        int min = index;  
        int left = left(index);  
        int right = right(index);  
  
        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){ //If the min greater than left  
            min = left;  
        }  
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){ //If the min greater than left  
            min = right;  
        }  
  
        if(min != index){  
            swap(min, index);  
            downheap(min);  
        }  
    }}
```

- Heap sort just getting data
```
public ArrayList<T> heapSort() throws Exception{  
     ArrayList<T> data = new ArrayList<>();  
     while(!list.isEmpty()){  
         data.add(this.remove()); //We will get in sorted Order  
     }  
     return data;  
}
```

https://youtu.be/cbbLgVb2V0I?si=-LHdMz13fC3aZ1Ao


## Kth Largest Element in a stream
- Adding the min heap
- This is stream so each time we need to return values
- if the last which is 3rd largest which is lesser then next then poll actual and offer new one
- Then each time we need to return it
```
class KthLargest {

    private PriorityQueue<Integer> minHeap;

    private int k;

  

    public KthLargest(int k, int[] nums) {

        this.k = k;

        this.minHeap = new PriorityQueue<>(k);

  

        for(int num: nums){

            add(num);

        }

    }

    public int add(int val) {

        if(minHeap.size() < k){

            minHeap.offer(val);

        }else if(val > minHeap.peek()){

            minHeap.poll();

            minHeap.offer(val);

        }

  

        return minHeap.peek();

  

    }

}

  

/**

 * Your KthLargest object will be instantiated and called as such:

 * KthLargest obj = new KthLargest(k, nums);

 * int param_1 = obj.add(val);

 */
```

## Closest point to the origin

**Step-by-step:**

|Point|Distance²|Heap State (max-heap)|Action|
|---|---|---|---|
|[3,3]|18|[[3,3]]|Add|
|[5,-1]|26|[[5,-1], [3,3]]|Add|
|[-2,4]|20|[[5,-1], [3,3], [-2,4]]|Size > 2 → remove farthest (26)|
- similarly we are finding the min so we need to implement the maxHeap
- similar process to get the last element

```
class Solution {

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1]));

  

        for(int[] point: points){

            maxHeap.add(point);

            if(maxHeap.size() > k){

                maxHeap.poll();

            }

        }

        int[][] result = new int[k][2];

        for(int i=0; i< k; i++){

            result[i] = maxHeap.poll();

        }

        return result;

    }

}
```

## Design twitter 
