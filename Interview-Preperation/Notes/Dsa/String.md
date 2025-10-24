## Encode and Decode the String
- Append the count of char + Spl symbol '#' + value
- Then decoding using i and j index
```
import java.util.*;

public class Main{
    
    static String encoding(String[] arr){
        StringBuilder stb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            stb.append(arr[i].length()).append("#").append(arr[i]);
        }
        return String.valueOf(stb);
    }
    
    static ArrayList<String> decode(String str){
        
        ArrayList<String> subStrings = new ArrayList<String>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int value = Integer.parseInt(str.substring(i, j));
            String subset = str.substring(j+1 ,j+1 + value);
            subStrings.add(subset);
            i = j + 1 + value;
        }
        
        return subStrings;
    }
    public static void main(String[] args){
        String[] arr = {"neet","code","love","you"};
        String encoded = encoding(arr);
        System.out.println(decode(encoded));
    }
}
```