package homeWork;

public class Instructor extends User {
	private String lesson;
	

	public Instructor(int id, String firstName, String lastName, String lesson) {
		super(id, firstName, lastName);
		this.lesson = lesson;
	}

	public String getEducation() {
		return lesson;
	}

	public void setEducation(String lesson) {
		this.lesson = lesson;
	}

}
