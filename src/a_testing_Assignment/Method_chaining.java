package a_testing_Assignment;

class Account {
	String ID;
	String Name;
	int balance;

	public Account setID(String ID) {
		this.ID = ID;
		return this;
	}

	public Account setName(String Name) {
		this.Name = Name;
		return this;
	}

	public Account deposit(int x) {
		balance += x;
		return this;
	}

	public Account withdraw(int x) {
		balance -= x;
		System.out.println("You have withdrawn " + x + " amount");
	return this;
	}


public Account getinfo() {
	System.out.println("Account name : "+ Name+"\nAccount Id : "+ID+"\n"
			+ "Balance : "+balance);
	return this;
}


}

public class Method_chaining {

	public static void main(String[] args) {
		Account M = new Account();
		M.setID("ID450").setName("Tom").deposit(1000).withdraw(20).getinfo();
	}
}
