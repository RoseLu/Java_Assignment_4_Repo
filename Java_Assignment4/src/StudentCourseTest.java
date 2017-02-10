

public class StudentCourseTest {

	public static void main(String[] args) {
		
		//Creating objects for the classes and passing values to constructors
		Student stu1 = new Student("Neil","NUID41200");
		Student stu2 = new Student("Ann","NUID41201");
		Course cou1 = new Course("Mathematics",10);
		Course cou2 = new Course("Information Systems",6);
		
		//Checking the getter methods for student class
		System.out.println("Student " +stu1.getStudentName() +" registered for the course " +cou1.getCourseName());
		System.out.println("Student " +stu2.getStudentName() +" registered for the course " +cou2.getCourseName());
		System.out.println();
		
		//Checking the getter and setter methods for student class
		System.out.println("***Setting a new student name and id using the set method***");
		stu1.setStudentName("Mark");
		stu1.setStudentId("NUID41202");
		System.out.println("Student " +stu1.getStudentName() +" has the student id " +stu1.getStudentId());
		System.out.println();
		
		//Checking the getter methods for course class
		System.out.println("The number of students taking the course "+cou1.getCourseName() +" is " +cou1.getNumberOfStudent());
		System.out.println("The number of students taking the course "+cou2.getCourseName() +" is " +cou2.getNumberOfStudent());
		System.out.println();
		
		//Checking the setter methods for course class
		System.out.println("***Changing the numberofstudents in Information Systems class using the set method***");
		cou2.setnumberOfStudents(15);
		System.out.println("Now the number of students taking the course "+cou2.getCourseName() +" is " +cou2.getNumberOfStudent());
		System.out.println();
		
		//Checking the registration of courses
		System.out.println("***Checking a registration full case***");
		cou2.registerStudent(stu1);
		System.out.println();
		
		//Changing the numberofstudents to 8 and adding 2 students
		cou2.setnumberOfStudents(8);
		System.out.println("***Checking can register cases***");
		cou2.registerStudent(stu2);
		cou2.registerStudent(stu1);
		System.out.println();
		
		//Getting the registered students
		System.out.println("**Retreiving the students registered***");
		cou2.getStudents();
	}

}
