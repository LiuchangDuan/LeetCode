import java.util.HashSet;


public class IntersectionOfTwoArrays {
	
	public static void main(String[] args) {
		int[] test1 = {1, 2, 2, 1};
		int[] test2 = {2, 2};
		int[] result = intersection(test1, test2);
		for (int n : result) {
			System.out.println(n);
		}
	}
	
	public static int[] intersection(int[] num1, int[] num2) {
		// 使用Set，因为Set中不能有重复元素
		HashSet<Integer> set1 = new HashSet<Integer>();
		for (int n : num1) {
			set1.add(n);
		}
		HashSet<Integer> set2 = new HashSet<Integer>();
		for (int n : num2) {
			if (set1.contains(n)) {
				set2.add(n);
			}
		}
		int[] result = new int[set2.size()];
		int i = 0;
		for (int n : set2) {
			result[i++] = n;
		}
		return result;
	}

}
