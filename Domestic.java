package com.tyss.desingnpatternsfactory2;

public class Domestic extends Plan{

	@Override
	public void setRate() {
		Domestic domestic=new Domestic();
		System.out.println("the bill is="+domestic.generateBill(7));
		
		
	}

}
