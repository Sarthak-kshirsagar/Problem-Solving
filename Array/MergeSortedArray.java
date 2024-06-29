package Array;

import java.util.*;

public class MergeSortedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3 };
        mergeSortedArray(arr, arr2);

    }

    static void mergeSortedArray(int arr1[], int arr2[]) {
        int first = 0;
        int second = 0;
        int resultP = 0;
        int sortedArray[] = new int[arr1.length + arr2.length];

        // actual function to merge two sorted arrays
        int j = 0;
        while (first < arr1.length) {
            if (arr1[first] < arr2[second]) {
                sortedArray[j] = arr1[first];
                j++;
                if (first < arr1.length - 1) {
                    first++;
                }

            } else if (arr1[first] > arr2[second]) {
                sortedArray[j] = arr2[second];
                if (second < arr2.length - 1) {
                    second++;
                }
                j++;
            } else if (arr1[first] == arr2[second]) {
                sortedArray[j] = arr1[first];
                j++;
                if (first < arr1.length - 1) {
                    first++;

                }
                if (second < arr2.length - 1) {
                    second++;
                }
            }
        }

        // System.out.println(second);
        // for (int i = second; i < arr2.length; i++) {
        // if (sortedArray[j] < arr2[i] && sortedArray[j] != arr2[i]) {
        // // j++;
        // sortedArray[j] = arr2[i];
        // j++;
        // }
        // }

        // for (int i = 0; i < sortedArray.length; i++) {
        // System.out.print(sortedArray[i] + " ");
        // }

    }

}
