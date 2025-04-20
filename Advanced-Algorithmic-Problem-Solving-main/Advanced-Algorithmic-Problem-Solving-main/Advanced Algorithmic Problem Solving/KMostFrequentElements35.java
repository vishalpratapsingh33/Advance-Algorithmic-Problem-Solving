import java.util.*;
public class KMostFrequentElements35 {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(entry);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : minHeap) {
            result[i++] = entry.getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
    }
}
