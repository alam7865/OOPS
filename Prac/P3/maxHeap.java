import java.util.*;

public class maxHeap {
    public static void main(String[] args) {
        int arr[] = { 100, 64, 25, 9, 4 };

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
        }

        for (int i = 1; i <= 4; i++) {
            int x = maxHeap.remove();
            int x1 = (int) Math.sqrt(x);
            maxHeap.add(x1);
            // System.out.println(x1);
        }

        long sum = 0;
        while (maxHeap.size() != 0) {
            sum += maxHeap.remove();
        }

        System.out.println(sum);
    }
}
