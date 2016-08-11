
public class MoveZeroes {
	
	public static void main(String[] args) {
		int[] test = {1, 0, 0, 5, 0};
		moveZeroes(test);
		for (int i : test) {
			System.out.println(i);
		}
	}

	public static void moveZeroes(int[] nums) {
		int newIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[newIndex++] = nums[i];
			}
		}
		for (; newIndex < nums.length; newIndex++) {
			nums[newIndex] = 0;
		}
	}
	
}
