package semester_3;
/*-----------------------
 Author:Nandhakumar K S
 Date:18-07-2025
 ------------------------*/

class Book {
	public String title;
	public String author;
	public Double price;
	Book(){
		this.title ="Unknown";
		this.author = "Not assigned";
		this.price = 0.0 ;
	}
	public void displayDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author:" + author);
		System.out.println("Price:" + price);
	}
	

}
public class Constructor {
	public static void main(String [] args) {
		Book book = new Book();
		book.displayDetails();
	}
	
}