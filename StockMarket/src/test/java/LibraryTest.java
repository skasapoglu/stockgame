
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryTest {
    @Test 
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        System.out.print("hello this is my first test");
        Assert.assertTrue(classUnderTest.someLibraryMethod());
    }
}
