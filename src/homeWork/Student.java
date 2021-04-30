package homeWork;

public class Student extends User {
	private String email;
	private String course;
	
	
	
	public Student(int id, String firstName, String lastName, String email, String course) {
		super(id, firstName, lastName);
		this.email = email;
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

}
