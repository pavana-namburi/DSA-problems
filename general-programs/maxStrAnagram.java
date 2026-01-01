import java.util.*;
import java.util.stream.Collectors;

public class maxStrAnagram {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(computeRes(s));
        sc.close();
    }

    public static String computeRes(String s) {
        String a[] = s.split(" ");
        int n = a.length;
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char t[] = a[i].toCharArray();
            Arrays.sort(t);
            String str = Arrays.toString(t);
            if (hm.containsKey(str)) {
                hm.get(str).add(a[i]);
            } else {
                ArrayList<String> al = new ArrayList<>();
                al.add(a[i]);
                hm.put(str, al);
            }
        }

        Map<String, ArrayList<String>> sortedByCount = hm.entrySet()
                .stream()
                .sorted(Comparator.comparingInt((Map.Entry<String, ArrayList<String>> e) -> 
                        e.getValue().size()).reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        for (Map.Entry<String, ArrayList<String>> entry : sortedByCount.entrySet()) {
            ArrayList<String> x=entry.getValue();
            return x.get(0);
        }
        return "";
    }
}
