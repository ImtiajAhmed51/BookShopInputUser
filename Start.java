import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.*;
import java.util.Scanner;
import interfaces.*;
import classes.*;

public class Start {
  public static void main(String[] args) {
    try 
    {   
      Scanner sc = new Scanner(System.in);
      Scanner sc1 = new Scanner(System.in);
      System.out.println("\nName: Md. Imtiaj Ahmed");
      System.out.println("Id: 21-44828-1");
      System.out.println("Course: OOP (JAVA) H\n");
      BookShop a = new BookShop();
	    a.setName("Imtiaj Shop");
      boolean repeat = true;
        while (repeat) {
          System.out.println("\n-----------Welcome To "+a.getName()+"-----------");
          System.out.println("1. StoryBook - Press 1");
          System.out.println("2. TextBook - Press 2");
          System.out.println("3. StoryBook & TextBook All Print - Press 3");
          System.out.println("4. Exit - Press 4");
          System.out.print("Your Choice: ");
          int choice = sc.nextInt();
          switch (choice) {
            case 1:

              System.out.println("\n\n1. Do you want to Insert a Story Book? Then press 1");
              System.out.println("2. Do you want to Search a Story Book - press 2");
              System.out.println("3. Do you want to Remove a Story Book - press 3");
              System.out.println("4. Do you want to Print All the Story Book in "+a.getName()+"? Then press 4");
              System.out.println("5. Do you want to Go Sell & Add Quantity? Then Press 5");
              System.out.println("6. Do you want to Go to Main Menu? Then Press 6");
              System.out.print("Your Choice: ");
              int option1 = sc.nextInt();
              switch (option1) {
                case 1:

                  StoryBook s = new StoryBook();
                  System.out.print("\nSet Story Book Category: ");
                  s.setCategory(sc1.nextLine());
                  System.out.print("Set Story Book ISBN: ");
                  s.setIsbn(sc1.nextLine());
                  System.out.print("Set Story Book Title: ");
                  s.setBookTitle(sc1.nextLine());
                  System.out.print("Set Story Book AuthorName: ");
                  s.setAuthorName(sc1.nextLine());
                  System.out.print("Set Story Book Price: ");
                  s.setPrice(sc.nextDouble());
                  System.out.print("Set Story Book Available: ");
                  s.setAvailableQuantity(sc.nextInt());
                  a.insertStoryBook(s);

                  break;

                case 2:

                  System.out.print("\nType You Desire Story Book's ISBN: ");
                  a.searchStoryBook(sc1.nextLine());
                  break;

                case 3:

                  a.showAllStoryBooks();
                  System.out.print("\nType You Story Book's ISBN Which You Want to Remove: ");
                  StoryBook searched = new StoryBook();
                  searched.setIsbn(sc1.nextLine());
                  a.removeStoryBooks(searched);
                  break;

                case 4:
                  a.showAllStoryBooks();
                  break;

                case 5:
                  a.showAllStoryBooks();
                  System.out.print("\nSearch ISBN : ");
                  StoryBook b1 = a.quantityStoryBook(sc1.nextLine());
                  if (b1 != null) {
                    System.out.println("\nFound Story Book");
                    System.out.println("\n1.ADD\n2.Sell");
                    System.out.print("Your Choice: ");

                    int sb = sc.nextInt();
                    if (sb == 1) {
                      System.out.print("\nAdd Quantity Story Book: ");
                      b1.addQuantity(sc.nextInt());
                    } 
                    else if (sb == 2) {
                      System.out.print("\nSell Quantity Story Book: ");
                      b1.sellQuantity(sc.nextInt());
                    }
                    else {
                      System.out.println("\nWrong Input");
                    }
                  }
                  else{
                    System.out.print("\nStory Book is Not Found\n");
                  }

                  break;

                case 6:
                  System.out.println("\n----------");
                  System.out.println("Going Back");
                  System.out.println("----------");
                  break;

                default:

                  System.out.println("\n--------------");
                  System.out.println("Invalid Option");
                  System.out.println("--------------");
                  break;
              }

              break;

            case 2:
              System.out.println("\n\n1. Do you want to Insert a Text Book? Then press 1");
              System.out.println("2. Do you want to Search a Text Book - press 2");
              System.out.println("3. Do you want to Remove a Text Book - press 3");
              System.out.println("4. Do you want to Print All The Text Book in "+a.getName()+"? Then press 4");
              System.out.println("5. Do you want to Go Sell & Add Quantity? Then Press 5");
              System.out.println("6. Do you want to Go to Main Menu? Then Press 6");
              System.out.print("Your Choice: ");
              int option2 = sc.nextInt();
              switch (option2) {
                case 1:

                  TextBook t = new TextBook();
                  System.out.print("\nSet Text Book Standard: ");
                  t.setStandard(sc.nextInt());
                  System.out.print("Set Text Book ISBN: ");
                  t.setIsbn(sc1.nextLine());
                  System.out.print("Set Text Book Title: ");
                  t.setBookTitle(sc1.nextLine());
                  System.out.print("Set Text Book AuthorName: ");
                  t.setAuthorName(sc1.nextLine());
                  System.out.print("Set Text Book Price: ");
                  t.setPrice(sc.nextDouble());
                  System.out.print("Set Text Book Available: ");
                  t.setAvailableQuantity(sc.nextInt());
                  a.insertTextBook(t);
                  break;
                case 2:
                  System.out.print("\nType You Desire Text Book's ISBN: ");
                  a.searchTextBook(sc1.nextLine());
                  break;
                case 3:
                  a.showAllTextBooks();
                  System.out.print("\nType You Text Book's ISBN Which You Want to Remove: ");
                  TextBook searched = new TextBook();
                  searched.setIsbn(sc1.nextLine());
                  a.removeTextBooks(searched);
                  break;
                case 4:
                  a.showAllTextBooks();
                  break;
                case 5:
                  a.showAllTextBooks();
                  System.out.print("\nSearch ISBN : ");
                  TextBook t1 = a.quantityTextBook(sc1.nextLine());
                  if (t1 != null) {
                    System.out.println("\nFound Text Book");
                    System.out.println("\n1.ADD\n2.Sell");
                    System.out.print("Your Choice: ");

                    int tb = sc.nextInt();
                    if (tb == 1) {
                      System.out.print("\nAdd Quantity Text Book: ");
                      t1.addQuantity(sc.nextInt());
                    } 
                    else if (tb == 2) {
                      System.out.print("\nSell Quantity Text Book: ");
                      t1.sellQuantity(sc.nextInt());
                    }
                    else{
                      System.out.println("\nWrong Input");
                    }
                  }
                  else{
                    System.out.print("\nTextBook is not Found\n");
                  }

                  break;

                case 6:
                  System.out.println("\n----------");
                  System.out.println("Going Back");
                  System.out.println("----------");
                  break;

                default:

                  System.out.println("\n--------------");
                  System.out.println("Invalid Option");
                  System.out.println("--------------");
                  break;
              }

              break;
            case 3:
              a.showAllStoryBooks();
              a.showAllTextBooks();
              break;  

            case 4:

              System.out.println("\n----------------------");
              System.out.println("You have chose to Exit");
              System.out.println("----------------------");

              repeat = false;

              break;

            default:
              System.out.println("\n--------------");
              System.out.println("Invalid Choice");
              System.out.println("--------------");
              break;
          }
        }
      }

     catch (Exception e) {
      System.out.println("\n\nWrong Typing");
    }
  }

}
