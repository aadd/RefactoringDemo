/**
 * Created by User on 19.11.2015.
 */
import org.junit.*;
import org.mockito.*;
import java.util.ArrayList;

public class ArrayListTest {

    @Test
    public void TestArrayList()
    {
        ArrayList ar = new ArrayList();
        //Object obj = new Object(ArrayList.class);

       Assert.assertEquals(0, ar.size());

    }
}
