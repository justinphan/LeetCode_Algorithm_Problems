package students;


public class Address
	{
		private String streetAddress, city, state;
		private long zipCode;
	
//****************************************************************************
//Constructor: Setup this address with the specified data.
//****************************************************************************

public Address(String street, String town, String st, long zip)
	{
		streetAddress = street;
		city = town;
		state = st;
		zipCode = zip;
	}
//-------------------------------------------------------------------------
//Return a discription of this address
//-------------------------------------------------------------------------
public String toString()
	{
		String result;
		result = streetAddress + "\n";
		result += city + ", " + state + " " + zipCode;
		
		return result;
	}
	}
	
		