package prototypePattern;

public class UserDetails implements Prototype{
	private int rollNumber;
	private String firstName;
	private String lastName;
	private double marks;

	public UserDetails(int rollNumber, String firstName, String lastName, double marks) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
	}
	
	public void showDetails() {
		System.out.println(rollNumber+ "\t" +firstName+ "\t" +lastName+ "\t" +marks); 
	}
	
	public Prototype getClone() {
		return new UserDetails(rollNumber, firstName, lastName, marks);  
	}

}
