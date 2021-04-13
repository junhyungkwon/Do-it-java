package ifExample;

public class Student {

	int studentID;
	String studentName;
	int graede;
	String addrress;
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[]args) {
		Student studentAhn = new Student(); //Student 클래스 생성
		studentAhn.studentName = "권준형";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
		
	}
}
