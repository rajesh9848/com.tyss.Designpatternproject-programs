package com.tyss.desingnpatternsfactory2;

import java.util.Scanner;

public class PlanDemoMain {

	public static void main(String[] args) {
		Plan p=null;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the plan type");
		String name=scanner.next();
		p=GetPlan.getPlan(name);
		p.setRate();
		
		
	}

}
