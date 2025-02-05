import java.util.*;

public class list {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> sorted = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(3);

        sorted.addAll(list1);
        Collections.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            map.put(sorted.get(i), i);
        }
        System.out.println(map.toString());

        int i = 0;
        int swap = 0;

        System.out.println(list1.get(2));
        while (i < list1.size()) {
            int index = map.get(list1.get(i));

            if (index == i) {
                i += 1;
            } else {
                int temp = list1.get(i);
                list1.set(i, list1.get(index));
                list1.set(index, temp);
                swap++;
            }
        }

        System.out.println("Swap: " + swap);
    }
}
