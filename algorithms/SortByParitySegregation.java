import java.util.*;

public class SortByParitySegregation {
    void sortArray(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
                j++;
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

        SortByParitySegregation obj = new SortByParitySegregation();
        obj.sortArray(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
        
    }
}
