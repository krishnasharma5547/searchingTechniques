// Java implementation of recursive Binary Search
class BinarySearch {
    // Returns index of x if it is present in arr[l..
    // r], else return -1

    // With recursion
    int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        //  in array
        return -1;
    }

    //Without recursion
    public int binarySeachWithoutRecursion(int[] arr, int low, int high, int ele) {
        while (low <= high) {
            int med = (low + high) / 2;
            if (arr[med] == ele) {
                return med;
            } else if (arr[med] > ele) {
                high = med - 1;
            } else {
                low = med + 1;
            }
        }
        return -1;
    }
}