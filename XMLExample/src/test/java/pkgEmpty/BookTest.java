package pkgEmpty;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import pkgExceptions.BookException;
import pkgLibrary.Book;
import pkgLibrary.Catalog;

public class BookTest {

	@Test
	public void GetBookTest() throws BookException {
		Catalog cat = pkgLibrary.Book.ReadXMLFile();
		Book b = new Book(cat, "bk104");
		assertEquals("Fantasy", b.getGenre());
		
	}
	@Test
	public void AddBookTest() throws BookException {
		Book b = new Book("bk115","author",  "title", "genre", 20.35, new Date(1990, 20, 10), 
				"description", 15.21);
		Catalog cat = b.ReadXMLFile();
		cat.addBook(b);
		assertEquals("title",new Book(cat, "bk113").getTitle());
	}

}
