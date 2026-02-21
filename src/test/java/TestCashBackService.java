import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.mirea.CashBackService;

public class TestCashBackService {
    @ParameterizedTest
    @CsvSource(value = {"1000,true,100","10000,false,50","20000,false,1000"})
    public void shouldCheckAllConditions (int purchaseSum, boolean ifRegistered, int expected) {
        CashBackService cashBack = new CashBackService();
        int actual = cashBack.cashBackCalculation(purchaseSum,ifRegistered);
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "TestDataFile.csv")
    public void shouldCheckAllConditionsFileSource (int purchaseSum, boolean ifRegistered, int expected) {
        CashBackService cashBack = new CashBackService();
        int actual = cashBack.cashBackCalculation(purchaseSum,ifRegistered);
        Assertions.assertEquals(expected,actual);
    }
}
