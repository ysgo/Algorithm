package com.study.coding.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9; // output: [0,1]
    System.out.println(Arrays.toString(twoSum1(nums, target)));
    System.out.println(Arrays.toString(twoSum2(nums, target)));
    System.out.println(Arrays.toString(twoSum3(nums, target)));
  }

  static int[] twoSum1(int[] nums, int target) {
    int[] results = new int[2];
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          results[0] = i;
          results[1] = j;
        }
      }
    }
    return results;
  }

  static int[] twoSum2(int[] nums, int target) {
    HashMap<Integer, Integer> indexMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      indexMap.put(nums[i], i);
    }

    for (int i = 0; i < nums.length - 1; i++) {
      int num = target - nums[i];
      if (indexMap.containsKey(num) && indexMap.get(num) != i) {
        return new int[]{i, indexMap.get(num)};
      }
    }
    throw new IllegalArgumentException("Illegal Exception");
  }

  static int[] twoSum3(int[] nums, int target) {
    HashMap<Integer, Integer> indexMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int num = target - nums[i];
      if (indexMap.containsKey(num)) {
        return new int[]{indexMap.get(num), i};
      }
      indexMap.put(nums[i], i);
    }
    throw new IllegalArgumentException("Illegal Exception");
  }
}
