import java.util.*;

public class rank {
    public static void main(String[] args) {
        int arr[] = { 37, 12, 28, 9, 100, 56, 80, 5, 12 };
        // TreeMap<Integer, Integer> map = new TreeMap<>();
        // int x = 1;
        // // System.out.print("1");
        // map.put(x, arr[0]);
        // Arrays.sort(arr);
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i - 1] != arr[i]) {
        // x++;
        // // System.out.print(x);
        // if (!map.containsKey(x)) {
        // map.put(x, arr[i]);
        // }
        // } else {
        // // System.out.print(x);
        // if (!map.containsKey(x)) {
        // map.put(x, arr[i]);
        // }
        // }
        // }

        // for (Map.Entry<Integer, Integer> set : map.entrySet()) {
        // System.out.println(set.getKey() + " " + set.getValue());
        // }

        // int arr1[] = new int[arr.length];

        // for (int i = 0; i < arr.length; i++) {
        // arr1[i] = arr[i];
        // }
        // int n = arr.length;
        // // if(n==0)
        // // {
        // // return arr;
        // // }

        // int res[] = new int[n];
        // TreeMap<Integer, Integer> map = new TreeMap<>();
        // int x = 1;
        // // System.out.print("1");

        // Arrays.sort(arr);
        // map.put(arr[0], x);
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i - 1] != arr[i]) {
        // x++;
        // // System.out.print(x);
        // if (!map.containsKey(arr[i])) {
        // map.put(arr[i], x);
        // }
        // } else {
        // // System.out.print(x);
        // if (!map.containsKey(arr[i])) {
        // map.put(arr[i], x);
        // }
        // }
        // }

        // for (int i = 0; i < arr1.length; i++) {
        // int val = map.get(arr1[i]);
        // res[i] = val;
        // }

        // System.out.println(Arrays.toString(res));

        // int[] sortedUniqueNumbers = Arrays.stream(arr).distinct().sorted().toArray();
        int[] sortedUniqueNumbers = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(sortedUniqueNumbers));

    }
}
