import com.example.Cat;
import com.example.Predator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Predator predator;
    private Cat cat;

    @Before
    public void SetUp() {
        cat = new Cat(predator);
    }

    @Test
    public void getSoundTest() {

        String actualSound = cat.getSound();
        String expectedSound = "Мяу";

        assertEquals(actualSound, expectedSound);

    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = cat.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);

    }
}
