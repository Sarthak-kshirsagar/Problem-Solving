package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 10, 11, 12, 19 };
        System.out.println(lowerBound(arr, 3));
    }

    static int lowerBound(int arr[], int ele) {
        int low = 0;
        int high = arr.length - 1;
        int answer = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("mid is " + mid + " and high is " + high + " and low is " + low);
            if (arr[mid] < ele) {
                low = mid + 1;
                answer = mid;
            } else if (arr[mid] > ele) {
                high = mid - 1;
                answer = mid;
            } else if (arr[mid] == ele) {
                System.out.println("equl condition executed");
                high = mid - 1;
                answer = mid;
            }

        }
        // System.out.println(arr[low]);
        return answer;
    }
}
