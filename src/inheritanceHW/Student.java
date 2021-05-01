package inheritanceHW;

public class Student  extends User{
	private String [] percentage;
	
	//CONSTRUCTORS
	public Student() {
	
	}
	
	
	public Student(int id, String firstName, String lastName, String email, String[] courseName) {
		super (id,  firstName,  lastName,  email , courseName);
	}


	public Student(int id, String firstName, String lastName, String email, String[] courseName, String [] percentage) {
		super (id,  firstName,  lastName,  email , courseName);
		this.percentage= percentage;
	}

    //GET-SET
	public String[] getPercentage() {
		return percentage;
	}


	public void setPercentage(String[] percentage) {
		this.percentage = percentage;
	}
	
	
	
	

}
