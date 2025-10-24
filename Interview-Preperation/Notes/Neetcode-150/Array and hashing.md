


2. Anagram
```
class Solution {

    public boolean isAnagram(String s, String t) {

  

        if(s.length() != t.length()) return false;

  

        int[] count = new int[26];

  

        for(int i=0; i<s.length(); i++){

            count[s.charAt(i) - 'a'] += 1;

        }

  

        for(int j=0; j<t.length(); j++){

            if(count[t.charAt(j) - 'a'] == 0){

                return false;

            }

            count[t.charAt(j) - 'a'] -= 1;

        }

        return true;

    }

}
```

3) Two Sums
```
class Solution {

    public int[] twoSum(int[] nums, int target) {

        int compliment = 0;

        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            compliment = target - nums[i];

            if(hash.containsKey(compliment)){

                return new int[] {hash.get(compliment), i};

            }

            hash.put(nums[i], i);

        }

        return new int[] {};

    }

}
```

4) Product of Array Except self
```
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

        left[0] = 1;
        for(int i = 1; i < n; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        right[n-1] = 1;
        for(int i = n-2; i >= 0; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        for(int i = 0; i < n; i++){
            result[i] = left[i] * right[i];
        }

        return result;
    }
}

```

5) Valid sudoku
```
class Solution {

    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();

        for(int i=0; i<9; i++){

            for(int j=0; j<9; j++){

                char curr_val = board[i][j];

                if(curr_val != '.'){

                    if(!set.add(curr_val + " row val " + i) ||

                       !set.add(curr_val + " col val " + j) ||

                       !set.add(curr_val + "grid val" + i/3 +"-" + j/3) return false;

                    )

                }

            }

        }

        return true;

    }

}
```