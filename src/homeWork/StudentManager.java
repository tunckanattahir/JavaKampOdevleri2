package homeWork;

public class StudentManager extends UserManager {
	
	public void selectCourse(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kurs Se�ildi.");
	}
	
	public void returnToPreviousLesson() {
		System.out.println("Onceki derse donuldu.");
	}
	
	public void finishAndContinue() {
		System.out.println("Bitirilip Devam Edildi");
	}

}
