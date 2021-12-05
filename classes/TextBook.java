package classes;
import java.lang.*;
import interfaces.*;
public class TextBook extends Book{
    private int standard;
    //TextBook() {
    //}
    //TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
    //    super(isbn, bookTitle, authorName, price, availableQuantity);
    //    this.standard = standard;
    //}
    @Override
    public void setStandard(int standard) {
        this.standard = standard;
    }
    @Override
    public int getStandard() {
        return this.standard;
    }
    @Override
    public void showDetails() {
        System.out.println("-----Text Book-----");
        System.out.println("Text Book Standard : " + this.getStandard());
        System.out.println("ISBN : " + this.getIsbn());
        System.out.println("Text Book Title : " + this.getBookTitle());
        System.out.println("Text Book Author : " + this.getAuthorName());
        System.out.println("Text Book Price : " + this.getPrice());
        System.out.println("Text Book Avaiable Quantity : " + this.getAvailableQuantity());
        System.out.println("\n");
    }
}