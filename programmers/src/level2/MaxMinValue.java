package level2;

import java.util.Arrays;

public class MaxMinValue {
	public static void main(String[] args) {
		SolutionMaxMinValue su = new SolutionMaxMinValue();
		String s = "1 2 3 4";		// 1 4
//		String s = "-1 -2 -3 -4";	// -4 -1
//		String s = "-1 1";			// -1 1
		System.out.println(su.solution(s));
	}
}
class SolutionMaxMinValue {
	  public String solution(String s) {
		  StringBuffer sb = new StringBuffer();
		  String[] num = s.split(" ");
	      int[] nums = new int[num.length];
	      for(int i=0; i<nums.length; i++) {
	    	  nums[i] = Integer.parseInt(num[i]);
	      }
	      Arrays.sort(nums);
	      sb.append(nums[0]);
	      sb.append(" ");
	      sb.append(nums[nums.length-1]);
	      return sb.toString();
	      
	      /* 22번째부터 다른 코드
	       * sb.append(Arrays.stream(nums).min().getAsInt());
	       * sb.append(" ");
	       * sb.append(Arrays.stream(nums).max().getAsInt());
	       * return sb.toString();
	       */
	      
	  }
	}