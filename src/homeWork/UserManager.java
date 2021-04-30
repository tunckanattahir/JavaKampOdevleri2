package homeWork;

public class UserManager {
	
	public void editProfile(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Profiliniz Duzenlendi. ");	}
	
	public void logIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Giris Yapildi.");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Oturumunuz Kapatildi.");
	}
}
