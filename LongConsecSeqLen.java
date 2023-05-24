package com.exam2;

import java.util.HashSet;

public class LongConsecSeqLen {
    public static int longestConsecutiveSequenceLength(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestSequence = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentSequence = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentSequence += 1;
                }

                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }

        return longestSequence;
    }

    public static void main(String[] args) {
        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5};
        int length = longestConsecutiveSequenceLength(nums);
        System.out.println("Length of the longest consecutive sequence: " + length);
    }
}
