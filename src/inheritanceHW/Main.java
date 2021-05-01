package inheritanceHW;

public class Main {

	public static void main(String[] args) {
		
		
		String[] courses = { "java", "c#" , "Programlamaya Giris"};
		

		Instructor engin = new Instructor(1, "Engin", "Demirog", "engin@gmail.com", courses);

		Student mehmet = new Student(1, "Mehmet", "Cim", "mc@gmail.com", courses);  // percentage simdilik yok
		
		
		
		
		UserManager userManager= new UserManager();
		userManager.add(engin);
		userManager.add(mehmet);
		
		
		
		// asagidaki komutlar ise  farkli manager Class'larda metodlarin override edilerek kullanilmasina örnektir
		
		//InstructorManager instructorManager = new InstructorManager();
		//instructorManager.add(engin);
		
		//StudentManager studentManager = new StudentManager();
		//studentManager.add(mehmet);
		
		
		
		

	}

}
