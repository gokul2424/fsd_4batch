
public class Todo {

	String text;
	
	Todo(String text){
		this.text = text;
	}
	
	
	@Override
	public String toString() {
		return "Todo [text=" + text + "]";
	}

	public static void main(String[] args) {
		Todo todo1 = new Todo("Buy milk!!");
		Todo todo2 = new Todo("Item2");
		
		System.out.println(todo1);
		System.out.println(todo2);
	}
	
}
