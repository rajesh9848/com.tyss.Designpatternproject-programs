package com.tyss.desingnpatternsfactory2;

public class Commercial extends Plan {

	@Override
	public void setRate() {
		Commercial commercial=new Commercial();
		System.out.println("the bill is="+commercial.generateBill(10));
		
	}

}
