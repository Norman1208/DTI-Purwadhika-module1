package org.example.day6;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicatesChecker {
    public static void run() {
        int[] nums1 = {1,2,3,1};
        System.out.println(Arrays.toString(nums1)+" isDuplicate: "+ findDuplicate(nums1));

        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(nums2)+" isDuplicate: "+ findDuplicate(nums2));

        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(Arrays.toString(nums3)+" isDuplicate: "+ findDuplicate(nums3));
    }

    public static boolean findDuplicate(int[] arr) {
        // create hashset to store unique elements
        HashSet<Integer> uniqueElements = new HashSet<>();

        // iterate through the array
        for (int elem : arr) {
            if (!uniqueElements.add(elem)){
                return true;
            }
        }
        return false;
    }
}
