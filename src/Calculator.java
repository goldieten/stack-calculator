import java.util.Stack;

public class Calculator {
	Stack<Integer> myStack = new Stack<>();
	public void loadConstant(int i) {
		myStack.push(i);
	}

	public String toString() {
		String after=".";
		return  myStack.toString().replace(",","")+after;
		
	}
	public void add() {
		int sum = myStack.get(0)+myStack.get(1);
		myStack.pop();
		myStack.pop();
		myStack.push(sum);
	}

	public void subtract() {
		int sum = myStack.get(0)-myStack.get(1);
		myStack.pop();
		myStack.pop();
		myStack.push(sum);		
	}

	public void multiply() {
		int sum = myStack.get(0)*myStack.get(1);
		myStack.pop();
		myStack.pop();
		myStack.push(sum);		
	}

	public void divide() {
		int sum = myStack.get(0)/myStack.get(1);
		myStack.pop();
		myStack.pop();
		myStack.push(sum);		
	}

	public void total() {
		int total=0;
		for (int i=0;i<myStack.size();i++)
		{
			total+=myStack.get(i);
		}
		myStack.clear();
		myStack.push(total);
	}

}
