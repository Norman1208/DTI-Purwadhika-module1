package org.example.day5;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // method to find indices of two numbers that add up to the target
    public int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{}; // return an empty array if no pair exists
    }
}
