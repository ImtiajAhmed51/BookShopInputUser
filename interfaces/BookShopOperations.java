package interfaces;
import java.lang.*;
import classes.*;
public interface BookShopOperations {
    String getName();
    
    boolean insertTextBook(TextBook tb);
    boolean removeTextBooks(TextBook tb);
    void searchTextBook(String isbn);
    TextBook quantityTextBook(String isbn);
    void showAllTextBooks();

    boolean insertStoryBook(StoryBook sb);
    boolean removeStoryBooks(StoryBook sb);
    void searchStoryBook(String isbn);
    StoryBook quantityStoryBook(String isbn);
    void showAllStoryBooks();
}
