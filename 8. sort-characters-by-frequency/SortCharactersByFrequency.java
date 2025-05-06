import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        queue.addAll(map.entrySet());

        StringBuilder res = new StringBuilder();
        while (!queue.isEmpty()) {
            Map.Entry<Character, Integer> entry = queue.poll();

            for (int i = 0; i < entry.getValue(); i++) {
                res.append(entry.getKey());
            }
        }

        return res.toString();
    }
}