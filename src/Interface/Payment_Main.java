package Interface;

class Payment_Main{
	public static void main(String args[]) {
		Payment p1=new UPI();
		p1.pay(10000);
		
		Payment p2=new CreditCard();
		p2.pay(25000);
	}
}

