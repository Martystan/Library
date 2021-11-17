import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> bag;

    public Borrower(){
        this.bag = new ArrayList<>();
    }

    public int countBooksInBag(){
        return this.bag.size();
    }

    public void putBookInBag(Book book) {
        this.bag.add(book);
    }

    public void borrowBookFromLibrary(Library library){
        Book book = library.removeFromStock();
        bag.add(book);
    }
}
