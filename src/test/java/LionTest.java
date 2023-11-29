import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualResult = lion.getKittens();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void getFoodtest() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = lion.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void exceptionTest() {
        assertThrows("Используйте допустимые значения пола животного - самей или самка", Exception.class, () -> new Lion(feline, "Самей"));

    }

}
