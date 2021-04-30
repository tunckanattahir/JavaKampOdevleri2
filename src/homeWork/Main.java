package homeWork;

public class Main {

	public static void main(String[] args) {
		
		
		Student student1 = new Student(125, "Tahir", "Tunckanat", "qwerty@gmail.com", "Java-React");
		Student student2 = new Student(126, "Ali", "Veli", "abcd@gmail.com", "Java-React");
		Student student3 = new Student(127, "Mehmet", "Tunc", "xyzt@gmail.com", "C#");
		
		Student[] students = {student1, student2, student3};
		
		Instructor instructor = new Instructor(2, "Engin", "Demirog", "Java-React , C#");
		
		
		
		UserManager userManager = new UserManager();
		userManager.logIn(instructor);
		userManager.logIn(student1);
		
		System.out.println("-----------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addHomework(students);
		instructorManager.addVideo(students);
		
		System.out.println("-----------------------------");
		
		userManager.logOut(instructor);
		userManager.logOut(student1);
		
	}

}
