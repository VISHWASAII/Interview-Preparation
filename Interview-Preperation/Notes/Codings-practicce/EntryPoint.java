import java.util.ArrayList;

public class EntryPoint {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();

        heap.insert(10);
        heap.insert(9);
        heap.insert(12);
        heap.insert(8);
        heap.insert(3);
        heap.insert(4);
        heap.insert(1);

        ArrayList list = heap.heapSort();
        System.out.println(list);

        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
    }

    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
                if(j >= n-1){
                    for(int k=n; k > 0; k--){
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }


}
