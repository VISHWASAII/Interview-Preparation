## Getting digits

```
// User function Template for Java
class Solution {
    static int getArmsNo(int n){
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum = sum + (int)Math.pow(digit, 3);
            n = n / 10;
        }
        return sum;
        
    }
    static boolean armstrongNumber(int n) {
       int value = getArmsNo(n);
       if(n == value) return true;
       else return false;
    }
}
```

## Reverse Number and Boundary condition

```
class Solution {

    public int reverse(int x) {

      long rev_num = 0;

  

  while(x != 0){

    int digit = x % 10;

    rev_num = (rev_num * 10) + digit;

    x = x / 10;

      }

    if(rev_num < Integer.MIN_VALUE || rev_num > Integer.MAX_VALUE) return 0;

      return (int)rev_num;

    }

}
```

## GCD or HCF
- Used to find command divisor btw two numbers
```
import java.util.*;

public class Main{
    
    static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
        int a = 18;
        int b = 48;
        int value = gcd(a, b);
        System.out.println("This is the GCD of a number  " + value);
    }
}
```

## Finding the prime Numbers

- we are calculating both n / i (1 - n) as well as sqrt of that for better approach
```
class Solution {
    static int countNum(int n){
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {   // include sqrt(n)
            if (n % i == 0) {
                count++;              // count i
                if (n / i != i) {     // count reciprocal if different
                    count++;
                }
            }
        }
        return count;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;     // 0 and 1 are not prime
        return countNum(n) == 2;      // prime if exactly 2 factors
    }
}

```

## Factorial of Numbers
```
import java.util.*;

public class Main{
    static int sum = 1;
    static int fact(int n){
        if(n == 0) return sum;
        sum = sum * n;
        fact(n-1);
        return sum;
    }
    public static void main(String[] args){
        int n  = 5;
        int value = fact(n);
        System.out.println(value);
    }
}
```

## Fibonacci Series using recursion 
```

class Solution {
    static int fibo(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public int nthFibonacci(int n) {
       int value = fibo(n);
       return value;
    }
}
```

## Hash map (Get and Put method)
- Need to count the frequency of an element
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,4,5,5,6};
        int idx = 0;
        HashMap<Integer, Integer> getCount = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            getCount.put(num, getCount.getOrDefault(num, 0) + 1);
        }

        // Print frequencies
        System.out.println("Frequencies:");
        for (Map.Entry<Integer, Integer> map : getCount.entrySet()) {
            System.out.println(map.getKey() + " -> " + map.getValue());
        }

        // Find maximum frequency
         // Find the element with max frequency
        int maxFreq = 0;
        int maxElement = -1;

        for (Map.Entry<Integer, Integer> entry : getCount.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
        }
        System.out.println(maxFreq);
    }
}

```

