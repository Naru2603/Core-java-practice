package com.oops.absraction;

public class TestBank {

	
	public static void main(String[] args) {
		
		Axis a = new Axis();
		
		System.out.println("ROI of axis is : "+a.roi());
		
		SBI s= new SBI();
		
		System.out.println("ROI of SBI is : "+s.roi());
		
		PNB p = new PNB();
		System.out.println("ROI of PNB is : "+p.roi());

	}

}
