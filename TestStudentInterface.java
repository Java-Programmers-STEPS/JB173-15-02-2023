package oops;

public class TestStudentInterface {

	public static void main(String[] args) {
		
		JavaStudent javaStudent=new JavaStudent();
		javaStudent.printData();
		PythonStudent pythonStudent=new PythonStudent();
		pythonStudent.printData();
		
StudentInterface studentInterface;
studentInterface=new JavaStudent();
studentInterface.printData();
	}

}
