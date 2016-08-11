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
			// 如果不是运算符（即如果是数字）
			if (!operators.contains(t)) {
				// 将数字压栈
				stack.push(t);
			} else { // 如果是运算符
				// 将栈中的两个数字弹栈
				// 栈中的元素为String， 需转换
				// 这里注意栈是后进先出
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				// 更改的地方
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
