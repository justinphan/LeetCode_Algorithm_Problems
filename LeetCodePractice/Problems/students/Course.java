package students;

import java.util.ArrayList;

public class Course{

	private String courseName;
	private ArrayList<Student> studentList = new ArrayList<Student>();

		
	public Course(String course_name){
		courseName = course_name;
		}
		
	public boolean addStudent(Student student)
	{
	    if (student == null || studentList.contains(student)){ 
	        return false;
	    }
	    studentList.add(student); 
	    return true;
	}
	
	//getters
	public String getcourseName(){
        return courseName;
    }
	
	//Setters
    public void setCourseName(String course_Name){
        courseName = course_Name;
    }
	

	public double courseAverage(){
		double sum = 0;
		int count = 0;
		for (Student Stu: studentList) {
			sum = sum + Stu.average();
			count++;
		}
		return sum/count;
	} 

	public void roll(){
		for (Student Stu: studentList) {
			System.out.println(Stu.toString());
		}

	}

}





