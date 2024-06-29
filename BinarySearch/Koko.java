package BinarySearch;

import java.util.*;

public class Koko {
    public static void main(String[] args) {

        int arr[] = { 312884470 };

        double a = 1.5;
        double b = Math.round(a);

        System.out.println(findKforKoko(arr, 312884469));

    }

    static int costOfEatingBanans(double a, int arr[]) {
        int cost = 0;
        for (int i = 0; i < arr.length; i++) {
            double div = Math.round(arr[i] / a);

            cost += Math.ceil((double) arr[i] / a);
        }
        return cost;
    }

    static int findMinimu(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min is " + min);
        return min;
    }

    static int findMaxi(int arr[]) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        System.out.println("Maxi is " + maxi);
        return maxi;
    }

    static int findKforKoko(int arr[], int k) {
        int min = 1;
        int maxi = findMaxi(arr);

        int cost = -1;
        // ArrayList<Integer> newArr = new ArrayList<Integer>();

        // for (int i = min; i <= maxi; i++) {
        // newArr.add(i);
        // }

        int low = 1;
        int high = maxi;
        int ans = 0;

        while (low <= high) {

            int mid = (high + low) / 2;

            cost = costOfEatingBanans((double) mid, arr);

            if (cost <= k) {
                high = mid - 1;
                ans = mid;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

}
