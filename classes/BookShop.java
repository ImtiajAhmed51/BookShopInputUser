package classes;
import java.lang.*;
import interfaces.*;
public class BookShop implements BookShopOperations{
    private String name;
    TextBook textBooks[]=new TextBook[100];
    StoryBook storyBooks[]=new StoryBook[100];
    //BookShop()
    //{
    //}
    //BookShop(String name){
    //this.name=name;
    //}
    public void setName(String name){
        this.name=name;
    }
    public String getName() {

        return this.name;
    }
    public boolean insertTextBook(TextBook tb){
        for(int i=0;i<textBooks.length;i++){
            if(textBooks[i]==null){
                textBooks[i]=tb;
                System.out.println("\nInsert a Text Book in Book Shop");
                tb.showDetails();
                return true;
            }
        }
        System.out.println("\n-----------------------------------------");
        System.out.println("Could not insert a Text Book in Book Shop");
        System.out.println("-----------------------------------------\n");
        return false;
    }
    public boolean removeTextBooks(TextBook tb){
        for(int i=0;i<textBooks.length;i++){
            if(textBooks[i]!=null && textBooks[i].getIsbn().equals(tb.getIsbn())){
                textBooks[i]=null;
                System.out.println("\n-------------------------------------------------");
                System.out.println("Isbn "+tb.getIsbn()+" Text Book has been Removed");
                System.out.println("-------------------------------------------------\n");
                return true;
            }
        }
        System.out.println("\n-----------------------------------");
        System.out.println("This Text Book has not been Removed");
        System.out.println("-----------------------------------\n");
        return false;
    }
    public void searchTextBook(String isbn){
        boolean flag=true;
        for(int i=0;i<textBooks.length;i++){
            if(textBooks[i]!=null ){
                if(isbn.equals(textBooks[i].getIsbn())){
                    System.out.println("\n---TextBook Found--");
                    textBooks[i].showDetails();
                    flag=true;
                    break;
                }
                else{
                    flag=false;
                }
            }
        }
        if(flag==false){
            System.out.println("\n------------------");
            System.out.println("TextBook Not found");
            System.out.println("------------------\n");
        }
    }
    public TextBook quantityTextBook(String isbn){
        for(int i=0;i<textBooks.length;i++){
            if(textBooks[i]!=null ){
                if(isbn.equals(textBooks[i].getIsbn())){
                    return textBooks[i];
                }
            }
        }
        return null;
    }

    public void showAllTextBooks(){
        for (int i=0;i<textBooks.length;i++)
        {
            if(textBooks[i]!=null){
            System.out.println("\nShop Name: "+this.getName());
            textBooks[i].showDetails();
            }
        }       
    }
    public boolean insertStoryBook(StoryBook sb){
        for(int i=0;i<storyBooks.length;i++){
            if(storyBooks[i]==null){
                storyBooks[i]=sb;
                System.out.println("\nInsert a Story Book in Book Shop");
                sb.showDetails();
                return true;
            }
        }
        System.out.println("\n------------------------------------------");
        System.out.println("Could not insert a Story Book in Book Shop");
        System.out.println("------------------------------------------\n");
        return false;
    }
    public boolean removeStoryBooks(StoryBook sb){
        for(int i=0;i<storyBooks.length;i++){
            if(storyBooks[i]!=null && storyBooks[i].getIsbn().equals(sb.getIsbn())){
                storyBooks[i]=null;
                System.out.println("\n-------------------------------------------------");
                System.out.println("Isbn "+sb.getIsbn()+" Story Book has been Removed");
                System.out.println("-------------------------------------------------\n");
                return true;
            }
        }
        System.out.println("\n------------------------------------");
        System.out.println("This Story Book has not been Removed");
        System.out.println("------------------------------------\n");
        return false;
    }
    public void searchStoryBook(String isbn){
        boolean flag=true;
        for(int i=0;i<storyBooks.length;i++){
            if(storyBooks[i]!=null ){
                if(isbn.equals(storyBooks[i].getIsbn())){
                    System.out.println("\n---Found StoryBook--");
                    storyBooks[i].showDetails();
                    flag=true;
                    break;
                }
                else{
                    flag=false;
                }
            }
        }
        if(flag==false){
            System.out.println("\n-------------------");
            System.out.println("StoryBook Not found");
            System.out.println("-------------------\n");
        }
    }
    public StoryBook quantityStoryBook(String isbn){
        for(int i=0;i<storyBooks.length;i++){
            if(storyBooks[i]!=null ){
                if(isbn.equals(storyBooks[i].getIsbn())){
                    return storyBooks[i];
                }
            }
        }
        return null;
    }
    public void showAllStoryBooks(){
        for (int i=0;i<storyBooks.length;i++){
            if(storyBooks[i]!=null)
            {
                System.out.println("\nShop Name: "+this.getName());
                storyBooks[i].showDetails();
            }
        }
    }
}
    

