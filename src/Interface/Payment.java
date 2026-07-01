package Interface;

interface Payment{
	public void pay(int amount);
}

class UPI implements Payment{
	public void pay(int amount) {
		amount=1000;
		System.out.println("Amount paid through UPI:"+amount);
		
	}
}

class CreditCard implements Payment{
	public void pay(int amount) {
		amount=25000;
		System.out.println("Amount paid through CreditCard:"+amount);
	}
}

