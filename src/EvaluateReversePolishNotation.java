import java.util.Stack;

/**
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */

public class EvaluateReversePolishNotation {
	
	public static void main(String[] args) {
		String[] test1 = {"2", "1", "+", "3", "*"};
		String[] test2 = {"4", "13", "5", "/", "+"};
		
		System.out.println(ovalRPN(test1));
		System.out.println(ovalRPN(test2));
		
	}
	
	public static int ovalRPN(String[] tokens) {
		int returnValue = 0;
		String operators = "+-*/";
		
		Stack<String> stack = new Stack<String>();
		
		for (String t : tokens) {
			// ������������������������֣�
			if (!operators.contains(t)) {
				// ������ѹջ
				stack.push(t);
			} else { // ���������
				// �����ֵ�ջ
				// ջ�е�Ԫ��ΪString����ת��
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				switch (t) {
				case "+":
					stack.push(String.valueOf(a + b));
					break;
				case "-":
					stack.push(String.valueOf(b - a));
					break;
				case "*":
					stack.push(String.valueOf(a * b));
					break;
				case "/":
					stack.push(String.valueOf(b / a));
					break;
				}
			}
		}
		
		returnValue = Integer.valueOf(stack.pop());
		
		return returnValue;
		
	}

}
