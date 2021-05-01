package inheritanceHW;

public class UserManager {
	
	

	public void add(Instructor user) {
		System.out.println("egitmen eklendi " + user.getFirstName());
	}


	public void update(Instructor user) {
		System.out.println("egitmen g�ncellendi");
	}

	public void delete(Instructor user) {
		System.out.println("egitmen silindi");
	}
	
	
	// override olmuyor
	public void add(Student user) {
		System.out.println("�grenci eklendi " + user.getFirstName());
	}

	//// override olmuyor
	public void update(Student user) {
		System.out.println("�grenci g�ncellendi");
	}

	// override olmuyor
	public void delete(Student user) {
		System.out.println("�grenci silindi");
	}
	
	
	// burada Polymorphism ile super class ile ayni metodlari tek bir kez yaabilirdik  
	//ancak egitman ve �grenci oldugu yazma konusunda siknti cikardi
}
