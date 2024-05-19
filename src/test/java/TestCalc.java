import core.calc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCalc {

    @Test
    public void testPlus(){
        int res = calc.plus(10,11);
        assertEquals(res,21);
    }

    @Test
    public void testMinus(){
        int res = calc.minus(10,11);
        assertEquals(res,-1);
    }


}
