
## This is the base case for recursion

![[Pasted image 20250917172142.png]]
- Subsets - which will used to find all combination of elements in an array
```
class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        generateAllCombination(0, nums, new ArrayList<Integer>(), result);

        return result;

    }

  

    public void generateAllCombination(int idx, int[] nums, List<Integer> current, List<List<Integer>> result){

        result.add(new ArrayList(current));

  

        for(int i=idx; i<nums.length; i++){

            current.add(nums[i]);

            generateAllCombination(i + 1, nums, current, result);

            current.remove(current.size() -1);

        }

    }

}
```
- Lets consider i have nums = [1,2]
- First 1 added current called recursive added to result
- Second time 1,2 is added then added to result
- then removed
- After that only 2 added then for loop stopped becoz i + 1

## Permutation

- It is flip flop of numbers of combination
- Like [1,2] and [2,1] 
- current - 1,2,3
- Used - used to maintain the used and un used elements in an array

```
class Solution {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        boolean[] flag = new boolean[nums.length];

        permutation(nums, result, flag, new ArrayList<>());

        return result;

    }

    public void permutation(int[] nums, List<List<Integer>> result, boolean[] used, List<Integer> current){

        if(current.size() == nums.length){

            result.add(new ArrayList<>(current));

            return;

        }

  

        for(int i=0; i<nums.length; i++){

            if(!used[i]){

                current.add(nums[i]);

                used[i] = true;

                permutation(nums, result, used, current);

                used[i] = false;

                current.remove(current.size() -1);

            }

        }

    }

}

```

## Generate Paranthesis

- This is the format we need to fellow
# Generate Parentheses (n = 2) — Step-by-Step Recursion & Backtracking

| Step | Current String     | Open | Close | Action           |
| ---- | ------------------ | ---- | ----- | ---------------- |
| 1    | ""                 | 0    | 0     | Start            |
| 2    | "("                | 1    | 0     | Add '('          |
| 3    | "(("               | 2    | 0     | Add '('          |
| 4    | "(()"              | 2    | 1     | Add ')'          |
| 5    | "(())"             | 2    | 2     | ✅ Valid → Save   |
| 6    | Backtrack to "(()" | 2    | 1     | Undo last ')'    |
| 7    | Backtrack to "(("  | 2    | 0     | Undo last ')'    |
| 8    | Backtrack to "("   | 1    | 0     | Try other option |
| 9    | "()"               | 1    | 1     | Add ')'          |
| 10   | "()("              | 2    | 1     | Add '('          |
| 11   | "()()"             | 2    | 2     | ✅ Valid → Save   |

## ✅ Final Results
- `(())`
- `()()`

```
class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        backtrack(result, new StringBuilder(), 0, 0, n);

        return result;

    }

        public void backtrack(List<String> result, StringBuilder current, int open,int close, int max){

  

            if(max * 2 == current.length()){

                result.add(current.toString());

            }

  

            if(open < max){

                backtrack(result, current.append("("), open + 1, close, max);

                current.deleteCharAt(current.length() -1);

            }

            //Close must cover the open

            if(close < open){

                backtrack(result, current.append(")"), open, close + 1, max);

                current.deleteCharAt(current.length() -1);

            }

    }

}
```

## Letter combination Of Phone Number
![[Pasted image 20250920135917.png]]
- We need to find all two possible numbers which is directly propotional to the input of numbers.
# Letter Combinations for "23" — Step-by-Step Backtracking (Simplified)

| Step | Index | Current Combination | Action                                        |
| ---- | ----- | ------------------- | --------------------------------------------- |
| 1    | 0     | ""                  | Start                                         |
| 2    | 0→1   | "a"                 | Pick 'a' for first digit                      |
| 3    | 1→2   | "ad"                | Pick 'd' for second digit → ✅ Save "ad"       |
| 4    | 1     | "a"                 | Backtrack, remove 'd', pick 'e' → ✅ Save "ae" |
| 5    | 1     | "a"                 | Backtrack, remove 'e', pick 'f' → ✅ Save "af" |
| 6    | 0     | ""                  | Backtrack, remove 'a', pick 'b'               |
| 7    | 0→1   | "b"                 | Pick 'b' for first digit                      |
| 8    | 1→2   | "bd"                | Pick 'd' for second digit → ✅ Save "bd"       |
| 9    | 1     | "b"                 | Backtrack, remove 'd', pick 'e' → ✅ Save "be" |
| 10   | 1     | "b"                 | Backtrack, remove 'e', pick 'f' → ✅ Save "bf" |
| 11   | 0     | ""                  | Backtrack, remove 'b', pick 'c'               |
| 12   | 0→1   | "c"                 | Pick 'c' for first digit                      |
| 13   | 1→2   | "cd"                | Pick 'd' for second digit → ✅ Save "cd"       |
| 14   | 1     | "c"                 | Backtrack, remove 'd', pick 'e' → ✅ Save "ce" |
| 15   | 1     | "c"                 | Backtrack, remove 'e', pick 'f' → ✅ Save "cf" |

```
class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

  

        if(digits == null || digits.length() == 0) return result;

        String[] hash = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        backtracking(result, hash,new StringBuilder(), digits, 0);

        return result;

    }

  

    public void backtracking(List<String> result, String[] hash, StringBuilder sb,String digits, int index){

  

        if(index == digits.length()){

            result.add(sb.toString());

            return;

        }

        int digit_val = digits.charAt(index) -'0';

        String val = hash[digit_val];

  

        for(char c: val.toCharArray()){

            sb.append(c);

            backtracking(result, hash, sb, digits, index + 1);

            sb.deleteCharAt(sb.length() -1);

        }

  

    }

  

}
```