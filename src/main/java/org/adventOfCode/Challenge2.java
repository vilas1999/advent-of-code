package org.adventOfCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.adventOfCode.FileUtils.getInputLists;

public class Challenge2 {

    public void calculateSimilarityScore() {
        String inputFilePath = "/Users/vilas/IdeaProjects/advent-of-code-2024/src/main/resources/challenge2_input";

        List<List<Integer>> inputArrays = getInputLists(inputFilePath);
        List<Integer> list1 = inputArrays.get(0);
        List<Integer> list2 = inputArrays.get(1);

        Map<Integer, Integer> frequencyMapInList1 = new HashMap<>();
        Map<Integer, Integer> frequencyMapInList2 = new HashMap<>();

        list1.forEach(number -> {
            frequencyMapInList1.put(number, frequencyMapInList1.getOrDefault(number, 0) + 1);
        });

        list2.forEach(number -> {
            frequencyMapInList2.put(number, frequencyMapInList2.getOrDefault(number, 0) + 1);
        });

        Integer similarityScore = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMapInList1.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            int frequencyInList2 = frequencyMapInList2.getOrDefault(key, 0);
            similarityScore += (value * frequencyInList2 * key);
        }

        System.out.println(similarityScore);
    }
}
