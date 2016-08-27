package com.leetcode.lbd;
import java.util.HashMap;
import java.util.Map;


public class Solution001TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	public static void main(String[] args){
		int[] x = {1,2,3,4,5};
		int[] res = new Solution001TwoSum().twoSum(x, 9);	
		System.out.println(res[0] +" " + res[1]);
	}
}
