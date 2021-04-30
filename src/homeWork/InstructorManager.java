package homeWork;

public class InstructorManager extends UserManager {
	
	//Ders programi ekle
	public void addSyllabus(Student[] students) {
		for (Student student : students) {
			System.out.println(student.getFirstName() + "  " + student.getLastName() + " Ders Programi Eklendi.");
		}
	}
	
	public void addVideo(Student[] students) {
		for (Student student : students) {
			System.out.println(student.getFirstName() + "  " + student.getLastName() + " Ders Videosu Eklendi.");
		}
	}
	
	public void addHomework(Student[] students) {
		for (Student student : students) {
			System.out.println(student.getFirstName() + "  " + student.getLastName() + " Ev Odevi Eklendi.");
		}
	}
	
	public void deleteCourse() {
		System.out.println("Kurs Silindi.");
	}
	
	public void addCourse() {
		System.out.println("Kurs Eklendi.");
	}

}
