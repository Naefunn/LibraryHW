import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> stock;

    public Library(int _capacity) {
        this.capacity = _capacity;
        this.stock = new ArrayList<Book>();
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean hasCapacity() {
        return capacity > stock.size();
    }

    public int stockCount() {
        return this.stock.size();
    }


    public void addBookToStock(Book book) {
        if (stockCount() < capacity) {
            this.stock.add(book);
        }
    }
}