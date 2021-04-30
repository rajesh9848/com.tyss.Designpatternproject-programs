package com.tyss.desingnpatternsfactory2;

public abstract class Plan {
	static final int cost=10;
	public abstract void setRate();
	
	public float generateBill(float units) {
		return cost*units;
	}

}
