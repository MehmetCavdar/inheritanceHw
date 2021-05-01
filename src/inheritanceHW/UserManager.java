package inheritanceHW;

public class UserManager {
	
	

	public void add(Instructor user) {
		System.out.println("egitmen eklendi " + user.getFirstName());
	}


	public void update(Instructor user) {
		System.out.println("egitmen güncellendi");
	}

	public void delete(Instructor user) {
		System.out.println("egitmen silindi");
	}
	
	
	// override olmuyor
	public void add(Student user) {
		System.out.println("ögrenci eklendi " + user.getFirstName());
	}

	//// override olmuyor
	public void update(Student user) {
		System.out.println("ögrenci güncellendi");
	}

	// override olmuyor
	public void delete(Student user) {
		System.out.println("ögrenci silindi");
	}
	
	
	// burada Polymorphism ile super class ile ayni metodlari tek bir kez yaabilirdik  
	//ancak egitman ve ögrenci oldugu yazma konusunda siknti cikardi
}
