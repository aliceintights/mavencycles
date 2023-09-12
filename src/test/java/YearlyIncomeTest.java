import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.YearlyIncome;

public class YearlyIncomeTest {

    @Test
    public void shouldCalcYearlyIncome() {
        YearlyIncome service = new YearlyIncome();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}