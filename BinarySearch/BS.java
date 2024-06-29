package BinarySearch;

public class BS {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 3, 5, 9, 12 };
        System.out.println(binarySearch(arr, 0));
        // System.out.println(recursiveBinarySearch(arr, 99, 0, arr.length - 1));
    }

    static int binarySearch(int arr[], int search) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {

            int mid = (high + low) / 2;
            System.out.println("mid is " + mid);
            if (arr[mid] < search) {
                low = mid + 1;

            } else if (arr[mid] > search) {
                high = mid - 1;

            } else if (arr[mid] == search) {
                System.out.println("Element found at index " + mid);
                return mid;

            }
        }
        return -1;
    }

    static int recursiveBinarySearch(int arr[], int search, int low, int high) {

        int mid = (high + low) / 2;
        int answer = -1;
        if (arr[mid] == search) {
            System.out.println("element found at index " + mid);
            return mid;
        }
        if (low <= high) {
            if (arr[mid] > search) {
                high = mid - 1;
                answer = recursiveBinarySearch(arr, search, low, high);
                if (answer != -1) {
                    return answer;
                }
            } else if (arr[mid] < search) {
                low = mid + 1;
                answer = recursiveBinarySearch(arr, search, low, high);
                if (answer != -1) {
                    return answer;
                }
            }
        }
        return answer;
    }
}
