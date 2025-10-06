import java.util.Scanner;

public class TwoSum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        ArrayList<List<Integer>> result = twoSum(numbers, target);
        if (result.isEmpty()) {
            System.out.println("No pairs found.");
        } else {
            System.out.println("Pairs found:");
            for (List<Integer> pair : result) {
                System.out.println(pair);
            }
        }
    }
    public static ArrayList<List<Integer>> twoSum(int[] nums, int target) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> addedPairs = new HashSet<>();
        for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                List<Integer> pair = Arrays.asList(Math.min(num, complement), Math.max(num, complement));
                String pairKey = pair.toString();
                if (!addedPairs.contains(pairKey)) {
                    result.add(pair);
                    addedPairs.add(pairKey);
                }
            }
            seen.add(num);
        }
        return result;
    }
}
