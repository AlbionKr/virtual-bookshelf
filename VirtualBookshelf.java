/* Name: Group 5
 * Final Project
 * Date: 4/15/2025
 */

 /// Importing right Libary
import java.util.ArrayList;

public class VirtualBookshelf 
{

    private static ArrayList<String> bookDatabase = new ArrayList<>();

    static {
        bookDatabase.add("The Alchemist");
        bookDatabase.add("1984");
        bookDatabase.add("To Kill a Mockingbird");
    }

    // Add a book to the bookshelf
    public static String addBook(String title) 
    {
        if (!bookDatabase.contains(title)) 
        {
            bookDatabase.add(title);
            return "Book added: " + title;
        }
        return "Book already exists: " + title;
    }

    // Search for a book and return result message
    public static String searchBook(String title)
     {
        if (bookDatabase.contains(title)) 
        {
            return "Book found: " + title;
        } 
        else 
        {
            return "No book found in bookshelf";
        }
    }

    // Reset list between test runs
    public static void resetDatabase() 
    {
        bookDatabase.clear();
        bookDatabase.add("The Alchemist");
        bookDatabase.add("1984");
        bookDatabase.add("To Kill a Mockingbird");
    }

    public static void main(String[] args) {
        System.out.println(addBook("The Hobbit"));
        System.out.println(searchBook("1984"));
        System.out.println(searchBook("Dune"));
    }
}


