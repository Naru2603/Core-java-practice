package com.basic.loops2;

public class LabeledBreak {

	public static void main(String[] args) {
		first: 
			for (int i = 1; i <= 10; i++) {
				System.out.println(">>> i = " + i);
				
				second: 
				for (int j = 1; j <= 6; j++) {
					System.out.println(">>>>>> j = " + j);

					for (int k = 1; k <= 3; k++) {
						if (k == 1)
							break second;
						System.out.println(">>>>>>>>>> k = " + k);
					}
				}
			}

	}

}
