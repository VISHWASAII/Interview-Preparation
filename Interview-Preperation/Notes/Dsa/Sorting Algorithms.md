## Types of Sorting Algorithms
- Comparison based
- Non Comparison based Algorithm

![[Pasted image 20251111221130.png]]

## Time Complexity And Feature

- Best Case -- If array is Sorted
- Average Case -- Taking the Average Of all time complexity
- Worst Case -- Max no of Operation need to be done
- Online no of input comes it doesn't disturb
- Stable - IF dup elements present how we are arrange in proper order or index.
- In place  - It doesn't take any extra space

## Time complexity

### Bubble
- If the first iteration itself not change anything then is is sorted array [add flag] - best case
- else worst case
- Average of both n2
- Space Complexity O(1)
- Online is not possible if we add middle not working fine
- It is stable.
- It is In place

### Selection 
- Worst case n2
- If array is also sorted we are looking for the smallest element so Best also n2
- Space Complexity O(1)
- Online not possible if we add new element
- It is not stable
- it is in place

## Insertion Sort
- Stream of element comes it will stable becoz it is online
- Use Median of stream of Integer
- Worst case n2
- Best case is n best in the first iteration itself we know it is sort
- Space Complexity O(1)
- it is in place
- It is stable becoz we swapping adjusting element
- And not have complete data

## Merge Sort
- Divide and Conqire algorithm
- The Best and worst time complexity - n long n 
- Space Complexity O(n)
- Not Inplace
-  and It is not online
- And it is stable 
- It is used to linked List
- If we have Huge chunk of data then we go for the Merge Sort
- It is not inplace

## Quick Sort
- It is also Divide and Conquire Algorithm
- Time Complexity Best is n long n
- And worst is n2
- Time complexity is O(1) 
- it is inplacce
- It is not online
- it is not Stable
## Why we are using sorting algorithm?

Sorting algorithms are essential for organizing data in a specific order, whether it's ascending or descending.

## Selection Sort
- Take Small first and compare with others 
- If element is min than comparable then swap it.
- We need to use Two for loop for this
![[Pasted image 20250919101100.png]]
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
![[Pasted image 20250919101713.png]]
```
import java.util.*;

public class Main{
    public static void main(String[] args){
        
       int[] arr = {10, 5, 26, 3, 15, 22};
       int n = arr.length -1;
       for(int i=0; i<arr.length; i++){
           for(int j=0; j<n-i-1; j++){
               if(arr[j] > arr[j + 1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
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
![[Pasted image 20250919103826.png]]

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
![[Pasted image 20250906121221.png]]
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

## Merge Sort inplace

```
import java.util.*;

public class Main{
    
    public static void mergeSortInPlace(int[] arr, int start, int end){
        
        if((end-start) == 1) return;
        int mid = (start + end) /2;
        
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);
        
        mergeInPlace(arr, start, mid, end);
    }
    
    public static void mergeInPlace(int[] arr, int start, int mid, int end){
        int i=start, j=mid, k=0;
        
        int[] joined = new int[end - start];
        
        while(i < mid && j < end){
            if(arr[i] > arr[j]) {
                joined[k] = arr[j];
                k++;
                j++;
            }else{
                joined[k] = arr[i];
                k++;
                i++;
            }
        }
        
        while(i < mid){
            joined[k++] = arr[i++];
        }
        while(j < end){
            joined[k++] = arr[j++];
        }
        
        for(int l=0; l<joined.length; l++){
            arr[start + l] = joined[l];
        }
    }
    
    public static void main(String[] args){
        int[] arr = {10, 5, 26, 3, 15, 22};
        int start = 0;
        int end = arr.length;
        
        mergeSortInPlace(arr, start, end);
        
        System.out.println(Arrays.toString(arr));
    }
}
```

## Quick Sort

- We need to take the mid point which is a pivot point 
- Then we need to check the left which is lesser than pivot
- And the right which is greater than pivot
- If Not valid then we need to swap left and right 
![[Pasted image 20250919141847.png]]
- After 1 st pass we need to do this
![[Pasted image 20250919142228.png]]

```
import java.util.*;

public class Main{
    
    public static void quickSort(int[] arr,int low,int high){
        
        if (low >= high) return;  // base case
        int start = low;
        int end = high;
        int mid = (start + end) /2;
        int pivot = arr[mid];
       
       while(start <= end){
            
        while(arr[start] < pivot){
            start++;
        }
        while(arr[end] > pivot){
            end--;
        }
              if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start ++;
                end --;
            }
       }
       quickSort(arr,low, end);
       quickSort(arr, start, high);
    }
    public static void main(String[] args){
        int[] arr = {10, 5, 26, 3, 15, 722};
        int low = 0;
        int high = arr.length -1;
        quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
}
```


### **Sorting Algorithm Identification Guide (Interview Shortcut)**

|**Clue / Keyword in Question**|**Algorithm to Identify**|**Key Technical Justification**|
|---|---|---|
|“Repeatedly swapping adjacent elements” / “simple but inefficient”|**Bubble Sort**|Repeated adjacent swaps; O(n²); good for teaching, not large datasets.|
|“Find smallest element and swap with first unsorted element”|**Selection Sort**|Select-minimum each pass; O(n²); minimal swaps.|
|“Build sorted array one element at a time” / “good for small or nearly sorted data”|**Insertion Sort**|Adaptive; efficient for small/narrowly unsorted datasets; O(n²) worst-case.|
|“Divide and conquer” + “always O(n log n)” + “uses extra space” + “stable”|**Merge Sort**|Recursively split & merge; O(n log n); stable; needs auxiliary arrays.|
|“Divide and conquer” + “in-place” + “average O(n log n), worst O(n²)” + “pivot”|**Quick Sort**|Partition-based; cache-friendly; unstable but fast in practice.|
|“Guaranteed O(n log n)” + “in-place” + “based on a binary heap”|**Heap Sort**|Heapify + extract-max; no extra memory; predictable performance.|
|“Count occurrences” + “integers within limited range”|**Counting Sort**|Non-comparison; O(n + k); stable for integers with small range.|
|“Sort integers or strings by digits or characters”|**Radix Sort**|Uses Counting Sort as subroutine; O(nk); linear-time under constraints.|
|“Uniform distribution” + “bucket / bins”|**Bucket Sort**|Divide into buckets, sort individually, concatenate; good for float data in [0,1).|
|“Stable sort” + “preserves order of equal keys”|**Merge Sort / Insertion Sort / Counting Sort / Radix Sort**|Stability ensures consistent ordering of equal elements.|
|“Worst-case O(n²) for Quick Sort” + “avoid by random pivot / median-of-three”|**Quick Sort Optimization**|Prevent skewed partitions; improves reliability.|
|“Sorting linked list”|**Merge Sort (preferred)**|Linked list partitioning is easy; no random access needed.|
|“Merging multiple sorted lists or files (external sorting)”|**K-way Merge Sort**|Merge K sorted sequences; used in external / disk-based sorting.|

---

### ⚡ **Quick Recognition Summary**

|**Scenario / Question Hint**|**Best Fit Algorithm**|
|---|---|
|Very small or nearly sorted data|**Insertion Sort**|
|Large data requiring guaranteed performance|**Merge Sort**|
|Fast in practice, in-memory sorting|**Quick Sort**|
|Limited memory, predictable O(n log n)|**Heap Sort**|
|Integers within small fixed range|**Counting Sort**|
|Sorting by digits or characters|**Radix Sort**|
|Uniformly distributed floating numbers|**Bucket Sort**|
|Teaching / understanding sorting basics|**Bubble Sort**|
|Merging sorted files / streams|**K-way Merge Sort**|