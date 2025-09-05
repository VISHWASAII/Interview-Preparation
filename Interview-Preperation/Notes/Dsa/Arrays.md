## Second Largest
```
import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] arr = {1,3,2,4,5,0,7};
        
        //Finding min Value
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < small){
                second_small = small;
                small = arr[i];
            }else if(arr[i] < second_small){
                second_small = arr[i];
            }
        }
        System.out.println("The second smallest element is " + second_small);
    }
}
```

## Find Sorted Array
```
import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        for(int i=1; i<arr.length; i++){
            if(arr[i -1] > arr[i]){
                System.out.println("false");
            }
            System.out.println("True");
        }
    }
}
```

## Remove Duplicates Using single Loop
- If i == j jump j else increase i and change the value
- Return index for get the unique elements with index [Important]
```
import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3,3};
        int i = 0;
        int j = 1;
        int len = arr.length-1;
        while(j <= len){
            if(arr[i] != arr[j]){
                i ++;
                arr[i] = arr[j];
            }else{
                j++;
            }
        }
        System.out.println(Arrays.toString(arr) + i);
    }
}
```

## Rotate Elements by 1 position

- For this the arr[i] = arr[i + 1] for left shifting and put the first index in last post
```
import java.util.*;

public class Main{
    public static void main(String[] args){
          int arr[]= {1,2,3,4,5};
          int first_idx = arr[0];
          int len = arr.length -1;
          for(int i=0; i<arr.length -1; i++){
              //Shifting the Array to Left side
              arr[i] = arr[i + 1];
          }
          arr[len] = first_idx;
          System.out.println(Arrays.toString(arr));
    }
}
```


## Rotate Array by K positions

- First rotate whole array
- Then rotate from 0 - k -1
- then k from to arr.len
```
class Solution {

    public void rotate(int[] nums, int k) {

        //This line will make the k with in array

        k = k % nums.length;

        int len = nums.length -1;

        reverse(nums, 0, len);

        reverse(nums, 0, k-1);

        reverse(nums, k, len);

    }

     public void reverse(int[] arr,int start,int end){

        while(start < end){

            int temp = arr[start];

            arr[start] = arr[end];

            arr[end] = temp;

            start++;

            end--;

        }

    }
}
```