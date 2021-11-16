import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;

    private Book book1;

    @Before
    public void before(){
        borrower = new Borrower();

        book1 = new Book("1984", "George Orwell", "General");

    }

    @Test
    public void hasEmptyBag(){
        assertEquals(0, borrower.countBooksInBag());
    }


}
