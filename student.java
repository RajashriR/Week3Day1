package Week3Day1;

public class student extends college {
	public void studentName() {
		System.out.println("Name of the Student ");

	}

	public void studentId() {
		System.out.println("Student Id ");

	}

	public void studentdept() {
		System.out.println("Student Department");

	}

	public static void main(String[] args) {
		
		student stud = new student();
		stud.studentName();
		stud.studentId();
		stud.studentdept();
		stud.deptname();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();

	}

}
