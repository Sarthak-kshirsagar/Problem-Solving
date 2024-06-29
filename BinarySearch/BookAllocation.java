package BinarySearch;

public class BookAllocation {
    public static void main(String[] args) {
        int arr[] = { 25, 46, 28, 49, 24 };
        System.out.println(bookAllocation(arr, 4));
    }

    static int findMax(int arr[]) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }

    static int calculateCost(int arr[], int num) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum = sum + arr[i];
            if (sum == num) {
                return sum;
            }

        }
        return sum;
    }

    static int bookAllocation(int arr[], int k) {
        int high = findMax(arr);
        int low = 1;
        int ans = -1;
        while (low <= high) {
            int mid = (high + low) / 2;
            int cost = calculateCost(arr, mid);
            if (cost == mid) {
                ans = cost;
            }
            if (cost >= mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return ans;
    }
}
