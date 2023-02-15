package oops;

public class AB implements A,B {
	
 
 public static void main(String[] args) {
	 AB obj=new AB();
	 obj.p();
	 }

@Override
public void s() {
	System.out.println("Method s");
	
}

@Override
public void p() {
	System.out.println("Method p");

}
 
}
