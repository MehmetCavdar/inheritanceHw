package inheritanceHW;

public class Instructor extends User {
	//private  ;  
	
	//CONSTRUCTORLAR
	public Instructor() {
		
	}
	
	
	//Dikkat. Extend olan fieldleri  tek tek  okuyamadik. süper  metoduyla okuduk
	public Instructor(int id, String firstName, String lastName, String email, String[] courseName) {
		super (id,  firstName,  lastName,  email , courseName);
	}


	//GET ve SET METODLARI




}
