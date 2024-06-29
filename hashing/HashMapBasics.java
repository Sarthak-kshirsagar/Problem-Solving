import java.util.*;

public class HashMapBasics {
    public static void main(String[] args) {
        // countFrequencyWihoutHashing();
        int[] arr = { 2, 3, 2, 3, 5 };
        System.out.println(countFrequencyUsingHashMap(arr));
    }

    static void countFrequencyWihoutHashing() {
        int arr[] = { 1, 1, 2, 3, 2, 4, 5, 2, 1, 1, 1, 1, 2, 3 };
        int count = 0;
        boolean toPrint = false;
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (temp == arr[j] && temp != Integer.MIN_VALUE) {
                    count = count + 1;
                    arr[j] = Integer.MIN_VALUE;
                    toPrint = true;
                    // continue;
                } else if (arr[j] == Integer.MIN_VALUE) {
                    // toPrint = false;
                    continue;
                }
            }

            if (toPrint) {
                // count = count + 1;
                System.out.println("Element:- " + temp + " count:- " + count);
                count = 0;
                arr[i] = Integer.MIN_VALUE;
                toPrint = false;
            }

        }

    }

    static HashMap<Integer, Integer> countFrequencyUsingHashMap(int[] arr) {
        // HashMap<Integer, Integer> elementWiseFrequency = new HashMap<Integer,
        // Integer>();

        // // initialize hashmap
        // for (int i = 0; i < arr.length; i++) {
        // elementWiseFrequency.put(i, 0);
        // }

        // for (int i = 0; i < arr.length; i++) {
        // if (elementWiseFrequency.containsKey(arr[i])) {
        // elementWiseFrequency.put(arr[i], elementWiseFrequency.get(arr[i]) + 1);
        // }
        // }

        // int[] result = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        // // System.out.println("add in reult aray " + i + " and value is " +
        // elementWiseFrequency.get(i));
        // result[i] = elementWiseFrequency.get(i);
        // }
        // // System.out.println("printing the result array");
        // // for (Integer i : result) {
        // // System.out.print(result[i] + " ");
        // // }
        // // System.out.println();
        // return elementWiseFrequency;

        HashMap<Integer, Integer> elementWiseFrequency = new HashMap<Integer, Integer>();
        for (int i = 0; i <= 5; i++) {
            elementWiseFrequency.put(i, 0);
        }

        for (int i = 0; i < arr.length; i++) {
            if (elementWiseFrequency.containsKey(arr[i])) {
                elementWiseFrequency.put(arr[i], elementWiseFrequency.get(arr[i]) + 1);
            }
        }

        for (int i = 1; i < arr.length; i++) {

            arr[i] = elementWiseFrequency.get(i);
            // if (i == arr.length - 1) {
            // arr[i] = elementWiseFrequency.get(i + 1);
            // }

        }

        for (int i = 1; i < arr.length; i++) {

            System.out.print(arr[i]);
        }

        return elementWiseFrequency;
    }

}