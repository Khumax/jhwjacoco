import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.khumax.jhwjacoco.StatisticsService;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void findMax2() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 15, 8, 4, 25, 3, 8, 6, 11, 11, 12};
        long expected = 25;

        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void findMax3() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 12, 12, 12, 12, 12, 12, 12, 12, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

}