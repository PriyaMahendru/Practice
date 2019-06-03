import com.random.Random;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class RandomTest {

    @Test
    public void getRandomValueTest(){

        Random r=new Random();
        List<Boolean> testBoolean= Arrays.asList(true,false);
        List<String> testString= Arrays.asList("priya","shivam");
        List<Integer> testInteger= Arrays.asList(12,56);

        Assert.assertNotNull(r.getRandomValue(testBoolean));
        Assert.assertNotNull(r.getRandomValue(testString));
        Assert.assertNotNull(r.getRandomValue(testInteger));


    }
}
