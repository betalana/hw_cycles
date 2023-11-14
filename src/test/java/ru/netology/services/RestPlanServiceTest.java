package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestPlanServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/balance.csv")
    public void testCalculate(int income, int expenses, int threshould, int expected){
        RestPlanService service = new RestPlanService();
        int actual = service.calculate (income, expenses, threshould);
        Assertions.assertEquals(expected, actual);
    }
}
