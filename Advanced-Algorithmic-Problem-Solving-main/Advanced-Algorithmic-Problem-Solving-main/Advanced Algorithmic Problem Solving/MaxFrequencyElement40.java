import java.util.HashMap;
import java.util.Map;
public class MaxFrequencyElement40 {
    public static int findMaxFrequencyElement(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxElement = arr[0];
        int maxFreq = frequencyMap.get(maxElement);
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 2, 4, 3, 1, 4, 3};
        System.out.println("Element with maximum frequency: " + findMaxFrequencyElement(arr));
    }
}
