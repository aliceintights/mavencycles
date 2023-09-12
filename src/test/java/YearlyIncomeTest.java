import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.YearlyIncome;

public class YearlyIncomeTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/vacation.csv")
    public void shouldCalcYearlyIncome(int expected, int income, int expences, int threshold) {
        YearlyIncome service = new YearlyIncome();
        int actual = service.calculate(income, expences, threshold);

        Assertions.assertEquals(expected, actual);
    }
}