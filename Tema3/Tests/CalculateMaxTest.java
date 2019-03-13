import Exercitiul1.CalculateMax;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateMaxTest {

    private CalculateMax m = new CalculateMax();

    @Test
    public void getMax() {
        int res = m.getMax(3,105,10);
        Assertions.assertEquals(105, res);
    }

    @Test
    public void getMaxEquals(){
        Assertions.assertEquals(105, m.getMax(105, 105, 105));
    }

}