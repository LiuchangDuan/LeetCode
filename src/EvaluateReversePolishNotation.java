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
			// 如果不是运算符（即如果是数字）
			if (!operators.contains(t)) {
				// 把数字压栈
				stack.push(t);
			} else { // 如果是数字
				// 把数字弹栈
				// 栈中的元素为String，需转换
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
