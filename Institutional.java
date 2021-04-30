package com.tyss.desingnpatternsfactory2;

public class Institutional extends Plan {
	@Override
	public void setRate() {
		Institutional institutional=new Institutional();
		System.out.println("the bill is="+institutional.generateBill(15));
		
		
	}

}
