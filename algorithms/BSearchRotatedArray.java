import java.util.Scanner;

public class BSearchRotatedArray {
    int search(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[left] < arr[right]) 
                return arr[left];

            if (arr[left] <= arr[mid]) { 
                left = mid + 1; 
            } else { 
                right = mid;
            }
        }
        return arr[left]; 
    }

    public static void main(String[] args) {
        BSearchRotatedArray bSearch = new BSearchRotatedArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = bSearch.search(arr);
        System.out.println("Least element: " + result);
        sc.close();
    }
}