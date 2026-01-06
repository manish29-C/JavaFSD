package com.exceptionHand;

public class Bank1 { 
	void banking() {
	ATM1 at=new ATM1();
	
	try {
		at.acceptInfo();
		at.verify();
	} catch (InvalidInputException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		
		System.out.println("Wrong Pin");
		System.out.println("Attempt2");
		
		try {
			at.acceptInfo();
			at.verify();
		} catch (InvalidInputException e1) {
			
			// TODO Auto-generated catch block
//			e1.printStackTrace();
			System.out.println("Wrong Pin");
			System.out.println("Attempt3");
			
			at.acceptInfo();
			try {
				at.verify();
			} catch (InvalidInputException e2) {
				// TODO Auto-generated catch block
//				e2.printStackTrace();
				
				System.out.println("Wrong Pin");
			
				System.out.println("U have been blocked for 24 hr;");
			}
		}
		
	}

	}
}
