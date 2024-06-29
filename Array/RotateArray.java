package Array;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotateArray(arr, 20);
        // System.out.println(54944 % );

        // int nums[]
    }

    static void rotateArray(int arr[], int k) {
        int j = 0;
        int left = 0;
        int right = 1;
        int counter = 1;
        k = k % arr.length;
        System.out.println("k is " + k);
        while (counter <= k) {
            while (right < arr.length) {
                if (left == 0) {
                    // swap left and right
                    int temp = arr[right];
                    arr[right] = arr[left];
                    arr[left] = temp;
                } else {
                    int temp = arr[j];
                    arr[0] = arr[right];
                    arr[right] = temp;
                }
                left++;
                right++;
            }
            left = 0;
            right = 1;

            System.out.println("rotated array by " + counter);
            counter = counter + 1;
        }
        System.out.println("rotation completed");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
