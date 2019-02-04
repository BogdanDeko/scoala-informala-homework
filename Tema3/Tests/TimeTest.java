import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TimeTest {

    @Test
    void setSecond() {
        Assertions.assertNotEquals(60,59);
    }

    @Test
    void setMinute() {
        Assertions.assertNotEquals(60,59);
    }

    @Test
    void setHour() {
        Assertions.assertNotEquals(24,23);
    }

//    @Test
//    void setTime() {
//        Assertions.assertEquals(59,59);
//    }
}