import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book1;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(3);
        book1 = new Book("1984", "George Orwell", "General");

    }

    @Test
    public void hasEmptyBag(){
        assertEquals(0, borrower.countBooksInBag());
    }

    @Test
    public void canPutBookInBag(){
        borrower.putBookInBag(book1);
        assertEquals(1, borrower.countBooksInBag());
    }

    @Test
    public void canBorrowBookFromLibrary(){
        library.addBook(book1);
        borrower.borrowBookFromLibrary(library);
        assertEquals(1,borrower.countBooksInBag());

    }


}
