

public class Account {
	
	String name; 
	int balance; 


	void setData(String pName, int pBalance) {
		name = pName;
		balance = pBalance;
	}
	void display() {
		
		System.out.print("Accountant name : " + name);
		System.out.println("\t Balance: " + balance + "VND");
	} 
	
	void deposit(long money){
		balance+=money;
		System.out.println("Ban da nap thanh cong "+money +" VND");
	}
	
	void withdraw(long money){
		if(money<=balance){
			balance-=money;
			System.out.println("Tai khoan cua ban sau khi rut tien la: "+balance);
		}
		else{
			System.out.println("Ban khong the rut tien!!");
		}
	}

}
