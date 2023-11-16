
// import java.util.Arrays;
// import java.util.Arrays;
// import java.util.stream.IntStream;

// import java.util.Scanner;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Map;
// import java.util.TreeMap;
import java.util.HashMap;

public class Temp {
    public static void main(String[] args) {
        // int[] ar=new int[5];
        // Temp obTemp=new Temp();
        // obTemp.set(ar);
        // for (int i : ar) {
        // System.out.println(i);
        // }
        // IntStream stream = IntStream.range(1, 11);
        // System.out.println(stream.max().getAsInt());
        // for (int i : IntStream.range(1, 11)) {
        // System.out.println(i);
        // }

        // IntStream st = IntStream.range(1, 11);
        // for (int t : st.toArray()) {
        // System.out.println(t);
        // }
        // int i = 0;
        // while (i < 10) {
        // if (i == 3) {
        // i++;
        // continue;
        // }
        // System.out.println(i);
        // i++;
        // }
        // }
        // public void set(int[] a)
        // {
        // a[0]=1;
        // }
        // int[] originalArray = { 1, 2, 3, 4, 5 };
        // int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
        // copiedArray[3]=9;
        // System.out.println(copiedArray[3]);
        // System.out.println(originalArray[3]);

        // int[] ar={1,0,8,7,4,5,3,6,3,2,1};
        // int[] copied = Arrays.copyOfRange(ar, 4, 8);
        // int max = Arrays.stream(copied).max().getAsInt();
        // System.out.println(ar);

        // int[] originalArray = { 1, 2, 3, 4, 5 };
        // int val=9;
        // originalArray[2]=val;
        // System.out.println(originalArray[2]);

        // int nextInteger = (int) Math.ceil(7);

        // System.out.println("Original Float Value: " + 7);
        // System.out.println("Next Greater Integer Value: " + nextInteger);

        // TreeMap<String, Integer> treeMap = new TreeMap<>();
        // treeMap.put("key0", 30);
        // treeMap.put("key1", 10);
        // treeMap.put("key1", 10);
        // treeMap.put("key2", 20);

        // for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
        // System.out.println(entry.getKey() + ": " + entry.getValue());
        // }
        // System.out.println(treeMap);

        // ArrayList<Integer> array = new ArrayList<>();
        // array.add(null);
        // array.add(5);
        // array.add(7);
        // int min = array.get(0);
        // for (int i = 1; i < array.size(); i++) {
        //     if (array.get(i) == null) {
        //         continue;
        //     }
        //     if (array.get(i) < min) {
        //         min = array.get(i);
        //     }
        // }
        // System.out.println(min);
        // System.out.println(Collections.min(array));

        HashMap<Integer,Integer> ob=new HashMap<>();
        ob.put(1, 5);
        System.out.println(ob.containsKey(1));

    }
}
