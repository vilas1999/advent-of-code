package org.adventOfCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class FileUtils {

    public static List<List<Integer>> getInputLists(String filePath) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineArgs = line.split(",");
                list1.add(Integer.valueOf(lineArgs[0]));
                list2.add(Integer.valueOf(lineArgs[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);
        return result;
    }
}
