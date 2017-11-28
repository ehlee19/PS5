package pkgExceptions;

import pkgLibrary.Book;;

public class BookException extends Exception {

	private Book b;
	private String BookID;

	public BookException(String BookID) {
		super();
		this.BookID = BookID;
	}
	public BookException(Book b) {
		super();
		this.b = b;
	}

	protected Book getB() {
		return b;
	}
	protected String getBookID() {
		return BookID;
	}
	
	
}
