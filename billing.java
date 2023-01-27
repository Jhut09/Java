
public class billing {
	
	public static void main(String[] args) {
		billing b = new billing();
		
		//computeBilling(PRICE, QUANTITY, COUPON VALUE));
		System.out.println("$"+b.computeBilling(31.99)+"\n");
		System.out.println("$"+b.computeBilling(31.99,3)+"\n");
		System.out.println("$"+b.computeBilling(31.99, 3, 15.0)+"\n");
	}

	static double computeBilling(double price) {
		
		double totalDue = price + (price * 0.08);
		
		return totalDue;
	}
	
	static double computeBilling(double price, int qty) {
		
		price = qty*price;
		
		double totalDue = price + (price * 0.08);
		
		return totalDue;
	}
	
static double computeBilling(double price, int qty, double cValue) {
		
		price = price *qty;
		
		price = price - cValue;
		
		double totalDue = price + (price * 0.08);
		
		return totalDue;
	}
}
