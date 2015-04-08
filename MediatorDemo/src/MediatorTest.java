
public class MediatorTest {

	public static void main(String[] args) {
		User karol = new User("Karol");
		User mark = new User("Mark");
		
		karol.sendMessage("Hi!");
		mark.sendMessage("Hello Karol");

	}

}
