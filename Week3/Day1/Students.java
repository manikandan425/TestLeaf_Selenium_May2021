package week3.day1.assignments;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Id is "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Id is "+id +"Name is "+name);
	}
	public void getStudentInfo(String email, int phone) {
		System.out.println("email is "+email +"Phone # is "+phone);
	}
	public static void main(String[] args) {
		Students student = new Students();
		student.getStudentInfo(792822);
		student.getStudentInfo(792822, " Mani");
		student.getStudentInfo("abc@gmail.com ", 636986147);
	}
}
