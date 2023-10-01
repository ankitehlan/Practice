package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * 1. Two Sum
Easy
52K
1.7K
Companies

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:

    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.

 */

public class TwoSum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,3,2,34,5);
        Integer target = 5;
        int[] results = twoSum(nums, target);
        System.out.println("Target = " + target + " and elements are " + results[0] + " and " + results[1]);
    }

    public static int[] twoSum(List<Integer> nums, Integer target) {
        HashMap<Integer, Integer> indices = new HashMap<>();

        for(int i = 0; i<nums.size(); i++) {
            int compliment = target - nums.get(i);
            if(indices.containsKey(compliment)) {
                return new int[]{
                    indices.get(compliment),
                    i
                };
            }
            else {
                indices.put(nums.get(i), i);
            }
        }
        return new int[] {};
    }
}