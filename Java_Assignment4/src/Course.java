import java.util.ArrayList;

public class Course {

	//Declaring the variables as private
	private String courseTitle;
	private int numberOfStudent;

	//Creating constructors for the class Course
	public Course(String courseTitle,int numberOfStudent){
		this.courseTitle=courseTitle;
		this.numberOfStudent=numberOfStudent;
	}

	public Course() {
	}

	//Setting mutator methods for coursename and numberofstudent
	public void setCourseName(String courseTitle){
		this.courseTitle=courseTitle;
	}

	public void setnumberOfStudents(int numberOfStudent){
		this.numberOfStudent=numberOfStudent;
	}

	//Creating accessor methods for coursename and numberofstudent
	public String getCourseName(){
		return courseTitle;
	}

	public int getNumberOfStudent(){
		return numberOfStudent;
	}

	//Method to check if a number of students are >10 for a course
	public boolean isFull(){
		if(numberOfStudent>10){
			return true;
		}
		return false;
	}

	//Creating an arraylist to store the registered students
	ArrayList<String> std = new ArrayList<String>();	
	public void registerStudent(Student student)
	{		
		if(isFull()==false){
			std.add(student.getStudentName());
			System.out.println("Hello " +student.getStudentName() +"! You are registered for the course");
		}
		else
			System.out.println("The registration is full for this course, so you cannot register");			
	}

	//Printing the array of registered students
	public ArrayList<String> getStudents(){
		System.out.println("The students registered for the course "+getCourseName() +" are " +std);
		return std;
	}	
}
