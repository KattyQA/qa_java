import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {


    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actualResult = feline.getFamily();
        String expectedResult = "Кошачьи";

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void getKittensFelineTest() {
        Feline feline = new Feline();
        int result1 = feline.getKittens(1);
        int result2 = feline.getKittens();

        assertEquals(result1, result2);

    }

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);

    }


}
