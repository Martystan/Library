

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int countBooks() {
        return stock.size();
    }

    public void addBook(Book book) {
        if(capacity > stock.size()){
            this.stock.add(book);
        }
    }
}
