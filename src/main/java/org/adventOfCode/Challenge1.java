package org.adventOfCode;

import java.util.Collections;
import java.util.List;

import static org.adventOfCode.FileUtils.getInputLists;

public class Challenge1 {

    public void getMinimumDistance() {
        String inputFilePath = "/Users/vilas/IdeaProjects/advent-of-code-2024/src/main/resources/challenge1_input";

        List<List<Integer>> inputArrays = getInputLists(inputFilePath);
        List<Integer> list1 = inputArrays.get(0);
        List<Integer> list2 = inputArrays.get(1);

        Collections.sort(list1);
        Collections.sort(list2);

        Integer diff = 0;
        for (int i = 0; i < list1.size(); i++) {
            diff += Math.abs(list1.get(i) - list2.get(i));
        }

        System.out.println(diff);
    }
}
