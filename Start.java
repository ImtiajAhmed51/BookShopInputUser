import java.lang.*;
import java.io.FileWriter;
import java.util.Scanner;
import interfaces.*;
import classes.*;
public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String UserId="Imtiajaa";
        String Password="81516";
        System.out.println("[:::::Admin Login:::::]");
        System.out.print("User Name: ");
        String User= sc1.nextLine();
        System.out.print("Enter Your Pass : ");
        String pass=sc1.nextLine();
        if(UserId.equals(User)&&Password.equals(pass)){
            try {
                FileWriter IM = new FileWriter("History.txt");
                BookShop a = new BookShop();
                a.setName("Imtiaj Shop");
                boolean repeat = true;
                while (repeat) {
                    System.out.println("\n-----------Welcome To "+a.getName()+"-----------");
                    System.out.println("\t1. StoryBook");
                    System.out.println("\t2. TextBook");
                    System.out.println("\t3. StoryBook & TextBook All Print");
                    System.out.println("\t4. Exit");
                    System.out.print("Enter Your Choice: ");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("\n\n\t1. Insert a Story Book.");
                            System.out.println("\t2. Search a Story Book.");
                            System.out.println("\t3. Remove a Story Book.");
                            System.out.println("\t4. Print All the Story Book in "+a.getName()+".");
                            System.out.println("\t5. Sell & Add Quantity.");
                            System.out.println("\t6. Go to Main Menu.");
                            System.out.print("Enter Your Choice: ");
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
                                    IM.write("Story Book\nIsbn Num: "+s.getIsbn()+"\nInsert\n");
                                    IM.flush();
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
                                        else
                                            System.out.println("\nWrong Input");
                                    }
                                    else
                                        System.out.print("\nStory Book is Not Found\n");
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
                            System.out.println("\n\n\t1. Insert a Text Book.");
                            System.out.println("\t2. Search a Text Book.");
                            System.out.println("\t3. Remove a Text Book.");
                            System.out.println("\t4. Print All The Text Book in "+a.getName()+".");
                            System.out.println("\t5. Sell & Add Quantity.");
                            System.out.println("\t6. Go to Main Menu.");
                            System.out.print("Enter Your Choice: ");
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
                                    IM.write("Text Book\nIsbn Num: "+t.getIsbn()+"\nInsert\n");
                                    IM.flush();
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
                                        else
                                            System.out.println("\nWrong Input");
                                    }
                                    else
                                        System.out.print("\nTextBook is not Found\n");
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
        else
            System.out.println("\nUnsuccessfully Login");
    }
}