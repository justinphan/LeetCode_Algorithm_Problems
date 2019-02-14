package students;

import java.text.DecimalFormat;
public class Student
	{
		private String firstName, lastName;
		private Address homeAddress, schoolAddress;
		private double score1, score2, score3;
		
		
//-----------------------------------------------------------------------------
//Counstructor set up this student with specified value
//-----------------------------------------------------------------------------
	
		public Student(String first, String last, Address home, Address school, double score1, double score2, double score3)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}

public Student(String first, String last, Address home, Address school)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		score1 = 0;
		score2 = 0;
		score3 = 0;
	}

public void setTestScore(int testNumber, double score)
	{
			switch (testNumber)
			{
				case 1:
				   score1 = score;
				   break;
				case 2:
				   score2 = score;
				   break;
				case 3:
				   score3 = score;
				   
			}
	}	
public double getTestScore(int testNumber){
			switch (testNumber)
			{
				case 1:
				   return score1;
				 
				case 2:
				   return score2;
				  
				case 3:
				   return score3;
				   
				default:
				   return 0;
				   
			}
		}

public double average(){
			double average = (score1 + score2 + score3)/3; 
				return average;
				}
	
	
		
//------------------------------------------------------------------------------
//Returns a string discription of this Student object.
//------------------------------------------------------------------------------
public String toString()
	{
		DecimalFormat fmt = new DecimalFormat("0.0#");
		String result;
		
		result = firstName + " "+ lastName + "\n";
		result += "Home Address: \n" + homeAddress + "\n";
		result += "School Address:\n" + schoolAddress + "\n";
		result += "Test1: " + score1 + " " + "Test2: " + score2 + " " + "Test3: " + score3 + "\n";
		result += "Average: " + fmt.format(average()) + "\n";
		
		
		return result;
	}
	}