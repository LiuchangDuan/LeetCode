import java.util.Stack;

/**
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */

/**
 * 
 * if JDK before 1.7
 * 
 * switch does not support String
 * 
 */

public class EvaluateReversePolishNotationBefore {
	
	public static void main(String[] args) {
		String[] test1 = {"2", "1", "+", "3", "*"};
		String[] test2 = {"4", "13", "5", "/", "+"};
		
		System.out.println(evalRPN(test1));
		System.out.println(evalRPN(test2));
	}

	public static int evalRPN(String[] tokens) {
		int returnValue = 0;
		String operators = "+-*/";
		
		Stack<String> stack = new Stack<String>();
		
		for (String t : tokens) {
			// ������������������������֣�
			if (!operators.contains(t)) {
				// ������ѹջ
				stack.push(t);
			} else { // ����������
				// ��ջ�е��������ֵ�ջ
				// ջ�е�Ԫ��ΪString�� ��ת��
				// ����ע��ջ�Ǻ���ȳ�
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				// ���ĵĵط�
				int index = operators.indexOf(t);
				switch (index) {
				case 0:
					stack.push(String.valueOf(a + b));
					break;
				case 1:
					stack.push(String.valueOf(b - a));
					break;
				case 2:
					stack.push(String.valueOf(a * b));
					break;
				case 3:
					stack.push(String.valueOf(b / a));
					break;
				}
//				switch (t) {
//				case "+":
//					stack.push(String.valueOf(a + b));
//					break;
//				case "-":
//					stack.push(String.valueOf(b - a));
//					break;
//				case "*":
//					stack.push(String.valueOf(a * b));
//					break;
//				case "/":
//					stack.push(String.valueOf(b / a));
//					break;
//				}
			}
		}
		
		returnValue = Integer.valueOf(stack.pop());
		
		return returnValue;
		
	}
	
}
