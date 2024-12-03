package org.apetrole.Days;

import java.util.Arrays;

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
}
