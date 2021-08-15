package classes;
import java.lang.*;
import interfaces.*;
public class StoryBook extends Book {
    
    private String category;
    
    //StoryBook(){
    //}
    //StoryBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,String category){
        
    //    super(isbn,bookTitle,authorName,price,availableQuantity);
    //    this.category=category;
    
    //}
    @Override
    public void setCategory(String category){
        this.category=category;
    }
    @Override
    public String getCategory(){
        return this.category;
    }
    @Override
    public void showDetails() {
        System.out.println("-----Story Book-----");
        System.out.println("Story Book Category : " + this.getCategory());
        System.out.println("ISBN : " + this.getIsbn());
        System.out.println("Story Book Title : " + this.getBookTitle());
        System.out.println("Story Book Author : " + this.getAuthorName());
        System.out.println("Story Book Price : " + this.getPrice());
        System.out.println("Story Book Avaiable Quantity : " + this.getAvailableQuantity());
        System.out.println("\n");

    }

}