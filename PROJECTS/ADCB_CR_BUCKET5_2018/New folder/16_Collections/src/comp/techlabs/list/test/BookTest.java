package comp.techlabs.list.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import comp.techlabs.list.Book;
import comp.techlabs.list.BookComparator;
import comp.techlabs.list.BookComparator.BookpublicationYear;

public class BookTest{
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Welcome to E-Libraray");
		System.out.println("Enter the number of book information you want to enter : ");
		List<Book> books = new ArrayList<Book>();
		 int size = scanner.nextInt();
	        for(int i=0; i<size; i++) {
	            System.out.println("Enter book title: ");
	            String title = scanner.next();
	            System.out.println("Enter the book Author : ");
	            String author = scanner.next();
	            System.out.println("Enter the price of book: ");
	            double price = scanner.nextDouble();
	            System.out.println("Enter year of publication: ");
	            int publication_year = scanner.nextInt();
	            
	            books.add(new Book(title, author, price, publication_year));
	        }
	        System.out.println("Original list of Book:");
	        printDetails(books);
	        
	        System.out.println("\nSorting first by Author, Title and then By Price");
	        compareSorting1(books);
	        printDetails(books);
	        
	         
	        System.out.println("\nSorting first by Publication Year, Price, Author");
	        compareSorting2(books);
	        printDetails(books);
	     
	}

	 public static void printDetails(List<Book> books) {
	        for(Book book : books) {
	            System.out.println(book);
	        }
	    }
	 public static void compareSorting1(List<Book> books) {
	        books.sort(new BookComparator.BookAuthor().thenComparing(new BookComparator.BookTitle()).
	        		thenComparing(new BookComparator.BookPrice()));
	    }
	    
	    
	    public static void compareSorting2(List<Book> books) {
	        books.sort(new BookpublicationYear().thenComparing(new BookComparator.BookPrice()).
	        		thenComparing(new BookComparator.BookAuthor()));
	    }
}