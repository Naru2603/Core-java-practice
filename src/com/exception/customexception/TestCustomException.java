package com.exception.customexception;

public class TestCustomException {

	public static void main(String[] args) {
		
		Citizen citizen = new Citizen("Narendra", 48521, "India", "A25");
		
		String res ="";
		
		try { 
			res = isValidVoter(citizen)? "Valid Voter" : "Invalid voter";
		}
		catch(InvalidAgeException e) {
			System.out.println("Inavlid age exception occucred");
			System.out.println(e.getMessage());
			e.getCause();
			e.printStackTrace();
		}
		

	}

	private static boolean isValidVoter(Citizen citizen) throws InvalidAgeException {
	
		try {
			int age = Integer.parseInt(citizen.getAge());
			
			if(age >=18)
				return true;
		}
		catch (Exception e) {
			throw new InvalidAgeException("Age is below 18..!!", e);
		}
		return false;
	}

}
