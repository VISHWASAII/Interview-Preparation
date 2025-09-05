## Selection Sort
- Take Small first and compare with others 
- If element is min than comparable then swap it.
- We need to use Two for loop for this
```
import java.util.*;

public class Main{
    public static void main(String[] args){
        
        int[] arr = {10, 5, 26, 3, 15, 22};
        
        for(int i=0; i<arr.length; i++){
            int min = arr[i];
            int min_idx = i;
            for(int j=i; j<arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    min_idx = j;
                }
            }
             //Swapping elements
                int temp = arr[i];
                arr[i] = min;
                arr[min_idx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
```
Time complexity - O(n^2)
- Selection sort is - Stable sort ?
- if Dup occur then it will change the order 
- Order will not maintain when the duplicate occur
### ✅ Advantages of Selection Sort:

1. **Easy to understand** – very simple algorithm.
    
2. **No extra memory** – it sorts in place (just swaps in the same array).
    
3. **Good when memory is small** – since it doesn’t need extra storage.
    

---

### ❌ Disadvantages of Selection Sort:

1. **Slow for large lists** – always takes `O(n²)` time (bad when `n` is big).
    
2. **Doesn’t stop early** – even if the array is already sorted, it still checks everything.
    
3. **More swaps than necessary** – compared to some other sorts like insertion sort.

## Bubble Sort

- Comparing two elements like sliding window
- And it will sort from right to left 
- if the right element which is lesser then left then sort.
```
import java.util.*;

public class Main{
    public static void main(String[] args){
        
        int[] arr = {10, 5, 26, 3, 15, 22};
        int n = arr.length -1;
        boolean swapped = true;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                swapped = false;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!swapped) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
```

Time complexity - O(n2)
Space complexity - O(1)
Stable - Yes it is stable sort 
Best case for Sorted Array - O(n)
Put bool value if that is true then it is best case for sorted Array.
### ✅ Advantages of Bubble Sort:

1. **Very easy to understand** – one of the simplest sorting algorithms.
    
2. **Can stop early** – if the array gets sorted before all passes, it can finish faster.
    
3. **In-place** – doesn’t need extra memory.
    

---

### ❌ Disadvantages of Bubble Sort:

1. **Still slow for big arrays** – worst case is `O(n²)` (like selection sort).
    
2. **Lots of swaps** – can be inefficient compared to other sorts.
    
3. **Not practical** – almost never used in real-world applications.

## Insertion sort
- We are comparing A building block with the previous element
- Lets take j comparing with j - 1
```
import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] arr = {10, 5, 26, 3, 15, 22};
        
        for(int i=0; i<arr.length; i++){
            for(int j= i; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
```
- Time complexity - Asc to desc - worst case
- O(N2)
- Best case - Sorted Array O(n)
- This is best Sort
- Using hybrid sort we can do more efficient stuffs.


## Merge Sort
- Divide and conquire
- Dividing the elements and conquiring it
![[Pasted image 20250905134905.png]]

- Here once single digit comes it will return and not calling the mid again so it will maintain the previous value correctly
- So directly two digits means [0, 1] will be used by the right and send it to the merge  and that return will be stored what will it call before.
```
import java.util.Arrays;  
  
public class MergeSort {  
  
    public static int[] mergeSort(int[] arr){  
       if(arr.length == 1)  return arr;  
  
       int mid = arr.length /2;  
  
       int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));  
       int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));  
  
       return merge(left, right);  
    }  
  
    public static int[] merge(int[] first, int[] second){  
        int[] joined = new int[first.length + second.length];  
        int i=0, j=0, k=0;  
  
        while( i < first.length && j < second.length){  
            if(first[i] < second[i]){  
                joined[k] = first[i];  
                i++;  
                k++;  
            }else{  
                joined[k] = second[j];  
                k++;  
                j++;  
            }  
  
        }        while(i < first.length)  
            joined[k++] = first[i++];  
        while(i < second.length)  
            joined[k++] = second[j++];  
  
        return joined;  
    }  
}
```

