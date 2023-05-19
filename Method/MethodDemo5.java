class MethodDemo5{
	static void calculateBill(double qty,double price,double transCharge)
	{
		//calculate total,gst,finalAmt
		
		double total=qty*price;
		double gstAmt=total+total*0.05;
		double finalAmt=(gstAmt+transCharge);

		System.out.println("TOTAL AMMOUNT:"+total);
		System.out.println("TOTAL gstAmt:"+gstAmt);
		System.out.println("FINAL AMMOUNT:"+finalAmt);
	}

	public static void main(String[] args) {
		calculateBill(5,600,50);
	}
}