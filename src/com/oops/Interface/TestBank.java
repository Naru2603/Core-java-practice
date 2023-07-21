package com.oops.Interface;

public class TestBank {

	public static void main(String[] args) {
		
		Axis a = new Axis();
		System.out.println("ROI of axis is : "+a.roi());

		
		SBI s = new SBI ();
		System.out.println("ROI of SBI is : "+s.roi());
		
		BOI b = new BOI();
		System.out.println("ROI of BOI is : "+b.roi());
	}

}
