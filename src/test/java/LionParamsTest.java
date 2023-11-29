import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionParamsTest {
    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public boolean expectedResult;
    @Mock
    Feline feline;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}


        };
    }

    @Before
    public void SetUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(feline, sex);
        boolean actualResult = lion.doesHaveMane();
        assertEquals(expectedResult, actualResult);

    }

}
