package src;

import com.scrumtrek.simplestore.Customer;
import com.scrumtrek.simplestore.Movie;
import com.scrumtrek.simplestore.PriceCodes;
import com.scrumtrek.simplestore.Rental;
import org.junit.*;
import org.mockito.*;
import java.util.ArrayList;

/**
 * Created by User on 20.11.2015.
 */
public class CustomerTest
{
    @Test
    public void TestChildrensMoviePrice()
    {
        Movie movCinderella = new Movie("children movie", PriceCodes.Childrens);
        Customer testUser = new Customer("test customer");
        Rental rental1 = new Rental(movCinderella, 1);


        testUser.addRental(rental1);

        String statement = testUser.Statement();
        Assert.assertTrue(testUser.Statement().contains("children movie\t1.5"));


    }


}
