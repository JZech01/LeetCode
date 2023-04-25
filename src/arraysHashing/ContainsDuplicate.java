package arraysHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	class Solution {

		public boolean containsDuplicate(int[] nums) {
			Set<Integer> singles = new HashSet<>(); //create HashSet
			for (int i = 0; i < nums.length; i++) {
				if (singles.contains(nums[i])) { //does the value exist in our HashSet
					return true;
				}
				singles.add(nums[i]); //add to singles
			}
			return false;
		}
	}
}
