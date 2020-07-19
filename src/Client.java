
public class Client {

	public static void main(String[] args) {

  //create a couple students
	    
	    Student s1 = new Student("sam", "123");
	    Student s2 = new Student("pam", "456");
	    
	    //create a lab class
	    
	    LabClass l = new LabClass(10);
	    
	    //load some students to the lab
	    l.enrollStudent(s1);
	    l.enrollStudent(s2);
	    
	    //what do we have..
	    l.printList();

	}

}
