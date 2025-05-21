
class DiscountPrice {
	public static void main(String args[]){
	int University_fee = 125000;
	int discount_amount = 10;
	int discounted_amount = (125000 * 10)/100;
	int final_fee = University_fee - discounted_amount;
	System.out.println("The discount amount is INR "+discounted_amount+" and final discounted fee is INR " + final_fee);
		
	}
}