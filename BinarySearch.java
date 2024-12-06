package arrayPack;
public class BinarySearch {
    public static void main(String[] args) {
        // Sorted array (for binary search, array must be sorted)
        int[] array = {10, 20, 30, 40, 50, 60, 70};
        int target = 40;  // Element to search

        // Perform binary search
        int result = binarySearch(array, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Binary Search Function
    public static int binarySearch(int[] array, int target) {
        int low = 0, high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid overflow

            if (array[mid] == target) {
                return mid;  // Element found
            } else if (array[mid] < target) {
                low = mid + 1;  // Search in the right half
            } else {
                high = mid - 1;  // Search in the left half
            }
        }

        return -1;  // Element not found
    }
}
