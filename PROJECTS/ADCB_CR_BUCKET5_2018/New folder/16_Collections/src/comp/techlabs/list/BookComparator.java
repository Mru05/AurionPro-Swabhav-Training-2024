package comp.techlabs.list;
import java.util.Comparator;
public class BookComparator {
	public static class BookTitle implements Comparator<Book>{
		@Override
		public int compare(Book book1, Book book2) {
			// TODO Auto-generated method stub
			return book1.getTitle().compareTo(book2.getAuthor());
		}		
	}
	public static class BookAuthor implements Comparator<Book>{
		@Override
		public int compare(Book book1, Book book2) {
			// TODO Auto-generated method stub
			return book1.getAuthor().compareTo(book2.getAuthor());
		}
	}	public static class BookPrice implements Comparator<Book>{
		@Override
		public int compare(Book book1, Book book2) {
			// TODO Auto-generated method stub
			if(book1.getPrice()>book2.getPrice())
				return 1;
			if(book1.getPrice()>book2.getPrice())
				return -1;
			return 0;
		}
		
	}	public static class BookpublicationYear implements Comparator<Book>{
		@Override
		public int compare(Book book1, Book book2) {
			if(book1.getPublicationYear()>book2.getPublicationYear())
				return 1;
			if(book1.getPublicationYear()>book2.getPublicationYear())
				return -1;
			return 0;
		
		}		
	}
}
