import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book("The Hobbit", "JRR Tolkien", "Fantasy");
        book2 = new Book("The Alchemist", "Paulo Coelho", "Fantasy");
        book3 = new Book("1984", "George Orwell", "General");
        book4 = new Book("War and Peace", "Leo Tolstoy", "Historical fiction");

    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToStock(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void checkLibraryHasCapacity(){
        assertEquals(3,library.getCapacity());

    }

    @Test
    public void checkImpossibleToAddBookIfAboveCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.countBooks());
    }
}


