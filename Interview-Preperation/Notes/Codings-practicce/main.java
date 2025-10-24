import java.util.*;

public class main{

    public static int trap(int[] height){

        int leftMax = height[0];

        Stack<Integer> stk = new Stack<>();
        stk.push(height[height.length -1]);
        for(int i=height.length - 2; i>=2; i--){
            int val = Math.max(stk.peek(), height[i]);
            stk.push(val);
        }
        int toWater = 0;

        for(int i=1; i<height.length -1; i++) {
            int min = Math.min(stk.peek(), leftMax);
            int temp = min - height[i];
            toWater += Math.max(0, temp);

            leftMax = Math.max(leftMax, height[i]);
            stk.pop();
        }
        return toWater;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = trap(height);
        System.out.println(result);
    }
}