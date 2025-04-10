import java.util.*;

public class arr {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // // 2,11,10,1,3
        // list.add(2);
        // list.add(11);
        // list.add(10);
        // list.add(1);
        // list.add(3);
        // Collections.sort(list);

        // int count = 0;
        // while (true) {

        // int x = list.get(0);
        // int y = list.get(1);
        // // int num = (Math.min(x, y)) * 2 + (Math.max(x, y));
        // int min = Math.min(x, y);
        // int max = Math.max(x, y);
        // int num = (min * 2) + max;
        // list.remove(0);
        // list.remove(0);
        // list.add(num);
        // Collections.sort(list);
        // if (list.size() == 1) {
        // break;
        // }

        // if (list.get(0) >= k) {
        // break;
        // }
        // }

        // System.out.println(list.toString());
        ////////////////////////////////////////////////////////////////////////////
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        pq.add((long) 1);
        pq.add((long) 2);
        pq.add((long) 3);
        pq.add((long) 4);
        pq.remove();
        System.out.println(pq.size());
        System.out.println(pq.toString());
    }
}
