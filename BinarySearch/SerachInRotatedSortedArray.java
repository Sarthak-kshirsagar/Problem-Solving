package BinarySearch;

public class SerachInRotatedSortedArray {

    public static void main(String[] args) {
        int arr[] = { 8, 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(searcInRotatedSortedArray(arr, 6));
    }

    static int searcInRotatedSortedArray(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[low] <= nums[high]) {
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    high = mid - 1;
                } else if (nums[mid] < target) {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[low] == target) {
                    return low;
                } else if (nums[high] == target) {
                    return high;
                } else if (nums[mid] > target && target > nums[low]) {
                    // in right part of the array

                    high = mid - 1;
                } else if (nums[mid] > target && target < nums[high]) {
                    // in left part of the array

                    low = mid + 1;
                } else {
                    break;
                }
            }
        }

        return -1;
    }
}
