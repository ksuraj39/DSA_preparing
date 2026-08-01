package Binary_search;

public class Make_Array_Empty {
    // find smallest in first n elements
    public static int smallest(int[] arr, int n) {
        int small = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }

    // rotate only first n elements
    public static void rotate(int[] arr, int n) {
        int item = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = item;
    }

    public static int Array_Empty(int[] arr) {
        int n = arr.length;   // correct size
        int operations = 0;

        while (n != 0) {
            int small = smallest(arr, n);
            boolean removed = false;

            for (int i = 0; i < n; i++) {
                if (arr[0] == small) {
                    // remove first element
                    for (int j = 0; j < n - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    n--;  // reduce size
                    operations++;
                    removed = true;
                    break; // go to next while loop iteration
                } else {
                    rotate(arr, n);
                    operations++;
                }
            }

            if (!removed) break; // safety
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 6, 5};
        System.out.println(Array_Empty(arr));
    }
}
