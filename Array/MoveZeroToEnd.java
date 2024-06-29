package Array;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int arr[] = { 0, 1 };
        moveZero(arr);
    }

    static void moveZero(int arr[]) {
        int left = 0;
        int right = 1;
        // System.out.println("entered");
        while (right < arr.length) {
            if (arr[left] != 0 && arr[right] == 0) {
                System.out.println("condition one executed");
                if (right != arr.length - 1) {
                    int temp = arr[right];
                    arr[right] = arr[right + 1];
                    arr[right + 1] = temp;
                }

            } else if (arr[left] == 0 && arr[right] == 0) {
                System.out.println("condition two executed");
                if (right != arr.length - 1) {
                    int travellar = right + 1;
                    while (travellar < arr.length) {
                        if (arr[travellar] != 0) {
                            int temp = arr[left];
                            arr[left] = arr[travellar];
                            arr[travellar] = temp;
                            break;
                        }
                        travellar++;
                    }
                }
            } else if (arr[left] == 0 && arr[right] != 0) {

                System.out.println("condition three executed");
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

            }
            left++;
            right++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
