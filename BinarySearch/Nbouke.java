package BinarySearch;

public class Nbouke {
    public static void main(String[] args) {
        int arr[] = { 1, 10, 3, 10, 2 };
        System.out.println(nbouqe(arr, 3, 1));
    }

    static int maxEle(int arr[]) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }

    static int returnNumberOfBouqe(int mid, int arr[], int m, int k) {
        System.out.println("mid is " + mid);
        int numberOfBoque = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= mid) {
                count = count + 1;
                System.out.println("counter incremented");
            } else if (arr[i] > mid) {
                System.out.println("counter to 0");
                count = 0;
            }

            if (count == k) {
                System.out.println("entered to add the bouqe");
                numberOfBoque = 1 + numberOfBoque;
                count = 0;
                // break;
            }

        }
        return numberOfBoque;

        // return numberOfBoque;
    }

    static int nbouqe(int arr[], int m, int k) {
        int maxEle = maxEle(arr);
        System.out.println("Maximum element is " + maxEle);
        int minimumDays = 1;
        int low = 0;
        int high = maxEle;
        int ans = -1;
        while (low <= high) {
            int mid = (high + low) / 2;
            int count = returnNumberOfBouqe(mid, arr, m, k);
            System.out.println("for mid " + mid + " number of bouque is " + count);

            if (count >= m) {

                ans = mid;
            }
            if (count >= m) {
                high = mid - 1;
                // System.out.println("answerr grater so high minus one");
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }
}
