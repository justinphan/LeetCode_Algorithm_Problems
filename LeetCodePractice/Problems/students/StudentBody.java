package students;

import java.text.DecimalFormat;
public class StudentBody
	{
//----------------------------------------------------------
// Creates some address and student objects and print them.
//----------------------------------------------------------
	public static void main(String[] args)
	{
		
//		Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
//		
//		Address jHome = new Address("21 Jump Street", "Blacksburg", "VA", 24551);
//		
//		Student john = new Student("John", "Smith", jHome, school, 78, 92, 80);
//		
//		Address mHome = new Address("124 MainStreet", "Euclid", "OH", 44132);
//		
//		Student marsha = new Student("Masha", "Jones", mHome, school, 90, 92, 87);
//		
//		Address sHome = new Address("22 Jump Street", "Blacksburg", "VA", 24551);
//		
//		Student steve = new Student("Steve", "Smith", sHome, school, 98, 82, 82);
//		
//		Address pHome = new Address("121 MainStreet", "Euclid", "OH", 44132);
//		
//		Student paul = new Student("Paul", "Jones", pHome, school, 100, 92, 89);
//		
//		Address aHome = new Address("123 MainStreet", "Euclid", "OH", 44132);
//		
//		Student allen = new Student("Allen", "Jones", aHome, school, 84, 97, 99);
//		
//	/*			
//		System.out.println(john);
//		System.out.println();
//		System.out.println(marsha);
//		
//	*/	
//		
//		Course cs151 = new Course("Introduction to Programing");
//		cs151.addStudent(john);
//		cs151.addStudent(marsha);
//		cs151.addStudent(steve);
//		cs151.addStudent(paul);
//		cs151.addStudent(allen);
//		
//		cs151.roll();
//		DecimalFormat fmt = new DecimalFormat("0.0#");
//		System.out.println("Average test score for all tests: " +
//				fmt.format(cs151.courseAverage()));
		
		
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n)
	{
		for(int i = n -1; i > 0; i++)
		{
			int j = m- 1;
			while(j > 0)
			{
				if(nums1[j] > nums2[i])
				{
					nums1[i + j - 2]= nums1[j];
					System.out.println(nums1[i + j + 1]);
					m--;
					j--;
					
				}
				else
				{
					nums1[i + j + 1]  = nums1[i];
					System.out.println(nums1[i + j + 1]);
					j = 0;
					
					
					
				}
			}
		}
		
	}
	}
	