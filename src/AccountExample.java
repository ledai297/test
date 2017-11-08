
public class AccountExample {
	public static void main(String args[]) {
		
		Account obj = new Account();
		
		obj.setData("Minh Nam", 100000);
		obj.display();
		obj.deposit(100000);
		obj.display();
		obj.withdraw(50000);
		obj.display();
		System.out.println("\n\n \tLe Trong Dai -- 20155320");
	}


}
