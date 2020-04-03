import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int ele = sc.nextInt();

        LinearSearch ls = new LinearSearch();
        int result = ls.search(arr, size, ele);
        testResult(result);

        BinarySearch bs = new BinarySearch();
        result = bs.binarySearch(arr, 0, size - 1, ele);
        testResult(result);
    }

    static public void testResult(int result) {
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
