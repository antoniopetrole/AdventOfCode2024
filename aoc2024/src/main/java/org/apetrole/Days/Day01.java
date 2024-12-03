package org.apetrole.Days;

import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day01 {
    public int solve(int[] list1, int[] list2){
        Arrays.sort(list1);
        Arrays.sort(list2);

        int sum = 0;

        for (int i=0; i < list1.length; i++){
            sum += Math.abs(list1[i] - list2[i]);
        }

        return sum;
    }

    public int part2(int[] list1, int[] list2){
        Map<Integer, Integer> occurences = new HashMap<Integer, Integer>();
        for (int i : list2){
            for (int j : list1){
                if (j == i){
                    if (occurences.containsKey(i)){
                        Integer current = occurences.get(i);
                        occurences.put(i, current + (i));
                    } else {
                        occurences.put(i, (i));
                    }
                }
            }
        }

        int solution = 0;
        for (Integer value : occurences.values()){
            solution += value;
        }

        return solution;
    }
}
