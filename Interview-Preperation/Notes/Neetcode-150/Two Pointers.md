1) valid palindrome
```
class Solution {

    public boolean isPalindrome(String s) {

   String normalized = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

  

    if(normalized.length() == 0){

        return true;

    }

    int right_idx = 0;

    int left_idx = normalized.length() -1;

        while(right_idx < left_idx){

            if(normalized.charAt(right_idx) != normalized.charAt(left_idx)) return false;

            right_idx++;

            left_idx--;

        }

    return true;

    }

}
```
### Two pointers

```
import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] nums = {2,3,4};
        int target = 6;
        
        int start = 0;
        int end = nums.length -1;
        
        while(start < end){
            if(nums[start] + nums[end] == target){
                System.out.println((start+1) + " " + (end+1));
                break;
            }else if(nums[start] + nums[end] < target){
                start ++;
            }else{
                end --;
            }
        }
    }
}
```

## 3 Sums

- i in 1
- j in 2
- k in 3
- It loop through one by one once end is there then we will going to stop.
- So, that we will get all sort of elements in an array
```
class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

  

        HashSet<Integer> set = new HashSet<>();

        HashSet<List<Integer>> result = new HashSet<>();

  

        for (int x : nums) {

            set.add(x);

        }

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                int third = -(nums[i] + nums[j]);

                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[k] == third) {

                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);

                        Collections.sort(triplet);

                        result.add(triplet);

                    }

                }

            }

        }

  

        return new ArrayList<>(result);

    }

}

```


## Contains Water
- Simple that line `` max = Math.max(max, height[start] * (end - start));`` is used to find area using width and height.
  ```
```
class Solution {

    public int maxArea(int[] height) {

  

        int start = 0;

        int end = height.length -1;

        int max = 0;

  

        while(start < end){

            if(height[start] < height[end]){

                max = Math.max(max, height[start] * (end - start));

                start++;

            }else{

                max = Math.max(max, height[end] * (end - start));

                end--;

            }

        }

        return max;

    }

}
```

