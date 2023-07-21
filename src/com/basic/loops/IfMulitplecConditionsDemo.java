package com.basic.loops;

public class IfMulitplecConditionsDemo {

	public static void main(String[] args) {
		
			
			
			String result = isValidVoter3(14, "us") ? "Valid Voter" : "Invalid Voter";
			
			System.out.println(result);
			
		}



	public static boolean isValidVoter(int age, String country, int hasAdhaar)
	{
		
		if(age>=18 && country.equalsIgnoreCase("India") && hasAdhaar > 0)
		{
			return true;
		}

		return false;
	}

	public static boolean isValidVoter2(int age, String country, int hasPancard)
	{
		
		if((age>=18 && country.equalsIgnoreCase("India")) || hasPancard > 0)
		{
			return true;
		}

		return false;
	}


	public static boolean isValidVoter3(int age, String country)
	{
		
		if(age>=18 )
		{
			if(country.equalsIgnoreCase("India"))
			{
				return true;
			}
		}
		return false;

	}

}
