//Hi, I'm having a problem w/ running my program. When I run my program I get 'School@7f31245a'.
//I know I'm doing something wrong and I think I'm getting confused with my methods. 
//Please take a look at my code and let me know what I'm doing wrong. 
//Thanks!



import java.util.ArrayList;

public class School {
	
	//Variables for this class
	ArrayList<Book> catalog1 = new ArrayList<Book>();
	static String name;
	int students;
	int staff;
	String mascot;
	

	/**
	 * Start the execution of your program here.
	 * 
	 * --------------INSTRUCTIONS----------------
	 * 1. The main method should create a school, add books to its catalog, and print all the books in its catalog.
	 * Use the library class for reference.
	 * 
	 * 2. After printing the books, the program should add students and print the total number of student.
	 * 
	 * 3. Finally, the program should call other methods that you design and print anything that makes sense for a school.
	 * 
	 * Thoughts:
	 * Schools have books, students, teachers, principles, classes.
	 * Add students, remove students, add teachers, open the school, close the school.
	 * 
	 * ----------------CHALLENGE:----------------
	 * 
	 * Can a school have a library? How would this be represented within the school?
	 * 
	 */
	ArrayList<Book> catalog = new ArrayList<Book>();
	
	public static void main(String[] args) {
		School scho = new School(name);
		
		System.out.println(scho.toString());
	}
	
	/**
	 * Constructs a school.
	 * this.name refers to the global variable for the class. String name is the name we pass in when building the school
	 * @param name
	 */
	public School(String name) {
		this.name = name;
		this.students = students;
		this.staff = staff;
		this.mascot = mascot;
	}
	
	/**
	 * Write a method to return a list of all books at the school
	 * @return 
	 */
	public void Library() {
		catalog1.add(new Book("Alice's Adventures in Wonderland", 200, "Fantasy", "Lewis Carroll"));
		
		catalog1.add(new Book("The Catcher in the Rye", 210, "Fiction", "J.D. Salinger"));
		
		catalog1.add(new Book("Fear and Loathing in Las Vegas", 204, "Non-Fiction", "Hunter S. Thompson"));
		
		catalog1.add(new Book("Harry Potter and the Sorcerer's Stone", 366, "Fantash", "J.K. Rowling"));
		
		catalog1.add(new Book("The Shining", 447, "Horror",  "Stephen King"));
	}
	
	/**
	 * adds a single student to the school
	 */
	public void AddSingleStudent() {
		int numStudents = 1;
		numStudents++;
		//Do I need a MAX_STUDENTS ???
	}
	
	/**
	 * removes a single student from the school
	 */
	public void removeSingleStudent() {
		int numStudents = 0;
		if(numStudents > 1) {
			numStudents--;
		}
	}
	
	/**
	 * method to return number of students
	 * 
	 * @return number of students in the school
	 */
	public int getStudents() {
		int numStudents = 0;
		return numStudents;
	}
}
