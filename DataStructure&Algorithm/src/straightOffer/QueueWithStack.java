package straightOffer;

import java.util.Stack;

public class QueueWithStack {
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

	public QueueWithStack() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}
	
	public void append(Integer element){
		stack1.push(element);
	}
	
	public Integer deleteHead(){
		if (!stack2.isEmpty()) {
			return stack2.pop();
		}else{
			while(stack1.size() > 0){
				stack2.push(stack1.pop());
			}
			return stack2.pop();
		}
		
	}
	
	public static void main(String[] args) {
		QueueWithStack queue = new QueueWithStack();
		queue.append(1);
		queue.append(2);
		queue.append(3);
		System.out.print(queue.deleteHead());
		System.out.print(queue.deleteHead());
		queue.append(4);
		System.out.print(queue.deleteHead());

	}

}
