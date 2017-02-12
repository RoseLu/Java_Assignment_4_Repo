
public class Student {
	
	//Declaring the variables as private
	private String studentName;
	private String studentId;

	//Creating constructors for the class Student
	public Student(String studentName,String studentId){
		this.studentName=studentName;	
		this.studentId=studentId;
	}
	
	//Creating a constructor with no parameters - in case needed
	public Student(){

	}

	//Setting mutator methods for student name and id
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}

	public void setStudentId(String studentId) {
		this.studentId=studentId;

	}

	//Creating accessor methods for student name and id
	public String getStudentName(){
		return studentName;
	}

	public String getStudentId(){
		return studentId;
	}
}
