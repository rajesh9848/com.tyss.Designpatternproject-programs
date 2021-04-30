package com.tyss.desingnpatternsfactory2;

public class GetPlan {
	public static Plan getPlan(String planname) {
		if(planname.equals("commercial")) {
			return new Commercial();
		}
		if(planname.equals("domestic")) {
			return new Domestic();
		}
		if(planname.equals("institutional")) {
			return new Institutional();
		}
		return null;
	}

}
