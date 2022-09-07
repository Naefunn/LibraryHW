import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library myLibrary;
    private Book book1;
    private Book book2;
    private Book book3;


    @Before
    public void before (){
        myLibrary = new Library(1);
        book1 = new Book("LOTR", "JRR Tolkein", "Fantasy");
        book2 = new Book("LOTR2", "JRR Tolkein", "Fantasy");
        book3 = new Book("LOTR3", "JRR Tolkein", "Fantasy");
    }

    @Test
    public void canReportCapacity() {
        assertEquals(true, myLibrary.hasCapacity());
    }

    @Test
    public void canAddBook__whenThereIsRoom() {
        myLibrary.addBookToStock(book1);
        assertEquals(1, myLibrary.stockCount());
    }

    @Test
    public void cantAddBook__whenNoRoom() {
        myLibrary.addBookToStock(book1);
        myLibrary.addBookToStock(book2);

        assertEquals(1, myLibrary.stockCount());
    }
}
