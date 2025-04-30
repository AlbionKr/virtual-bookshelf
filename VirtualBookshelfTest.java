/*  Group 5
// Final Project
 Date: 4/15/2025
*/

 import org.junit.*;

public class VirtualBookshelfTest 
{

    @Before
    public void resetBeforeEachTest() 
    {
        VirtualBookshelf.resetDatabase();
    }

    // Test adding a new book
    @Test
    public void testAddNewBook()
     {
        String result = VirtualBookshelf.addBook("Harry Potter");
        Assert.assertEquals("Book added: Harry Potter", result);
    }

    // Test adding a duplicate book
    @Test
    public void testAddDuplicateBook() 
    {
        String result = VirtualBookshelf.addBook("1984");
        Assert.assertEquals("Book already exists: 1984", result);
    }

    // Test searching for a book that exists
    @Test
    public void testSearchExistingBook() 
    {
        String result = VirtualBookshelf.searchBook("The Alchemist");
        Assert.assertEquals("Book found: The Alchemist", result);
    }

    // Test searching for a book that doesn't exist 
    @Test
    public void testSearchNonexistentBook() 
    {
        String result = VirtualBookshelf.searchBook("The Martian");
        Assert.assertEquals("Error: Book not found", result);
    }
}
