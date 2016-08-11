import java.util.HashSet;


public class ContainsDuplicate {
	
	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 2, 3, 4, 5, 6};
		System.out.println(containsDuplicate(nums));
		int[] test = {1, 2, 3, 4, 5, 6};
		System.out.println(containsDuplicate(test));
	}
	
	public static boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			// ������ظ� �ظ�ʱset.add(i)����false
			if (!set.add(i)) {
				return true;
			}
		}
		return false;
	}

}
