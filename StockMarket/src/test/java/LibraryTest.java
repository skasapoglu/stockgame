
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryTest {
    @Test 
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        Assert.assertTrue(classUnderTest.someLibraryMethod());
    }
}
