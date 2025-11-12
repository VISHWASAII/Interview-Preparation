import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    static int[] buffer_size = new int[10];
    static int idx=0;

    private static void push(int val){
        buffer_size[idx++] = val;
    }

    

}
