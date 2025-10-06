import java.util.*;

public class SortByParityTwoPointer {
    void sortArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] % 2 == 0) i++;
            else if (arr[j] % 2 == 1) j--;
            else {
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
                i++; j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        SortByParityTwoPointer obj = new SortByParityTwoPointer();
        obj.sortArray(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
