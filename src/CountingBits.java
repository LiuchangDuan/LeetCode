
public class CountingBits {
	
	public static void main(String[] args) {
		int[] test = countBit(5);
		for (int i = 0; i < test.length; i++)
			System.out.println(test[i]);
	}
	
	public static int[] countBit(int num) {
		int[] list = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			int count = 0;
			int j = i;
			while (j != 0) {
				count ++;
				// �൱��ÿ��ȥ��һ�������Ƶ�1
				j = j & j - 1;
			}
			list[i] = count;
		}
		return list;
	}

}
