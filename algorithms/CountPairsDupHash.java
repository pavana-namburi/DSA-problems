import java.util.*;

public class CountPairsDupHash {
    int countPairs(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : arr) {
            int diff = target - num;
            if (map.containsKey(diff)) count += map.get(diff);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements (with duplicates):");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Enter target:");
        int target = sc.nextInt();
        sc.close();
        System.out.println(new CountPairsDupHash().countPairs(arr, target));
    }
}
