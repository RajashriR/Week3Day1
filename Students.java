package Week3Day1;

public class Students {
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student Id: " + id + "Name of the Student :" + name);
	}
	public void getStudentInfo(int id, String name, String email)
	{
		System.out.println("Student Id: " + id + "Name of the Student : " + name +  " Email Id :" + email);
	}
	
	public void getStudentInfo(String name, long phoneno)
	{
		System.out.println( "Name of the Student :" + name + " Phone number:" + phoneno);
	}
	

	public static void main(String[] args) {
		Students st = new Students();
		st.getStudentInfo(122,"Raji");
		st.getStudentInfo(232, "Athi","manis@wre.com");
		st.getStudentInfo("Ramya", 5452477894L);
		
	}

}
